package control;

import model.BeanProva;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.AccesBeanProva;

/**
 *
 * @author montse
 * @version març 2017
 */
public class ControladorBeanProva extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        try {
            PrintWriter out = response.getWriter();
            // conexion
            AccesBeanProva bd = new AccesBeanProva();
            //hacer el request de de html insert o llistar
            String op = request.getParameter("accio");

            if (op.equals("insertBeanProva")) {
                BeanProva bp = (BeanProva) request.getAttribute("bean");
                //printa a la consola del servidor Glassfish
                System.out.println(bp);
                //enviem a persistir a MySQL a traves de bd
                bd.inserirBeanProva(bp);
                RequestDispatcher rd = request.getRequestDispatcher("MissatgeOKInsercio.jsp");
                rd.forward(request, response);

            } else if (op.equals("llistat")) {
                //manipulacio bd
                ArrayList<BeanProva> llista = bd.llistarBeanProva();
                request.setAttribute("beans", llista);
                //RequestDispatcher rd = request.getRequestDispatcher("03_llistatBeanProva.jsp");
                RequestDispatcher rd = request.getRequestDispatcher("2_llistat.jsp");
                rd.forward(request, response);
            }
        } catch (Exception e) {
            System.out.println("CONTROLADOR BEAN PROVA!!!!!!" + e);

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
