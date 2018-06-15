package control;

import model.Llibre;
import model.LlibreRepetitException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Query;
import org.hibernate.Session;
import util.Utilitats;

/**
 *
 * @author Montse
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {

            Session session = Utilitats.getSessionFactory().openSession();
            String op = request.getParameter("accio");

            if (op.equals("alta")) {
                //vista
                response.sendRedirect("formulari_alta_llibre.jsp");

            } else if (op.equals("insert")) {
                //les dades venen del formulari (la vista)
                Llibre book = (Llibre) request.getAttribute("llibre");
                //manipulacio bd a traves d'Hibernate
                try{
                session.beginTransaction();
                session.save(book);
                session.getTransaction().commit();
                response.sendRedirect("index.jsp");
                }catch(Exception e){
                    throw new LlibreRepetitException();
                }
                

            } else if (op.equals("llistat")) {
                //consulta a la bd a traves d'Hibernate
                session.beginTransaction();
                Query query = session.createQuery("from Llibre");
                List<Llibre> list = query.list();
                session.getTransaction().commit();
                request.setAttribute("llibres", list);
                RequestDispatcher rd = request.getRequestDispatcher("llistat_llibres.jsp");
                rd.forward(request, response);

                //llistat amb enllaç per modificar
            } else if (op.equals("eliminar")) {
                //vista
                response.sendRedirect("formulari_eliminar_llibre.jsp");

            } else if (op.equals("delete")) {
                //model 

                String id = request.getParameter("idLlibre");
                //consulta a la bd a traves d'Hibernate
                session.beginTransaction();
                Query query = session.createQuery("delete Llibre where id = :ID");
                query.setParameter("ID", new Integer(Integer.parseInt(id)));
                int result = query.executeUpdate();
                session.getTransaction().commit();
                response.sendRedirect("index.jsp");
            }
            }catch (Exception e) {
            System.out.println("CONTROLADOR!!!!!!" + e);

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
         * @param request servlet request
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

