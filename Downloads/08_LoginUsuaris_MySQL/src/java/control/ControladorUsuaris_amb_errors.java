
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AccesUsuaris;
import model.PasswordIncorrecteException;
import model.Usuari;
import model.UsuariInexistentException;
import model.UsuariRepetitException;


/**
 *
 * @author montse
 * @version març 2017
 */
public class ControladorUsuaris_amb_errors extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = response.getWriter();
        String missError="";
        try {
            
            
            AccesUsuaris bd = new AccesUsuaris();
            String op = request.getParameter("accio");
            if (op.equals("login")) {
                Usuari u = (Usuari) request.getAttribute("usu");
                System.out.println("Usuari en servlet, login="+u);
                try{
                //si va tot bé, vaig a benvinguda.jsp i passo el nom
                String nom=bd.validarUsuari(u);              
                //es pot enviar un atribut normal, o un atribut dintre de la sessió
                request.getSession().setAttribute("nom", nom);
                RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/vistas/benvinguda_amb_sessio.jsp");
               // RequestDispatcher rd = request.getRequestDispatcher("login_missatges/benvinguda_amb_sessio.jsp");
                rd.forward(request, response);
                }catch(UsuariInexistentException e){
                    missError="Usuari inexistent";
                }catch(PasswordIncorrecteException e){
                   missError="Password incorrecte";
                }               
                 
                   //Funciona el sendRedirect enviant atributs per la sessió, per
                    //als errors
                    request.getSession().setAttribute("error",missError);            
                    // si hi ha excepció, envio un missatge per la response? o request?
                    response.sendRedirect("/WEB-INF/vistas/login_amb_missatges_errors.jsp");
                    //NO VA con request dispatcher forward
//                    RequestDispatcher rd = request.getRequestDispatcher("Login_amb_missatges_errors.jsp");
//                    rd.forward(request, response);
                }
            else {
                if (op.equals("registre")) {
                    Usuari u = (Usuari) request.getAttribute("usu");
                    try{
                    bd.registrarUsuari(u);
                    //només passo el nom a la vista, a benvinguda.jsp
                    request.getSession().setAttribute("nom",u.getNom());
                    RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/vistas/benvinguda_amb_sessio.jsp");
                    rd.forward(request, response);
                    }catch(UsuariRepetitException e){
                        missError="L'usuari ja existeix";
                        request.getSession().setAttribute("error",missError);                   
                        response.sendRedirect("/WEB-INF/vistas/registrar_amb_errors.jsp");
                    }
                }
            }
                
             
        } catch (Exception e) {
            System.out.println("CONTROLADOR USUARIS!!!!!!" + e);
            throw new ServletException(e);
            // System.out.println(e);
        }
    }
        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
        /**
         * Handles the HTTP <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
             processRequest(request, response);
        }

        /**
         * Handles the HTTP <code>POST</code> method.
         *
         * @param re
         * quest servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
            () {
        return "Short description";
        }// </editor-fold>

    
}
