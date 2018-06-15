/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Pelicula;
import modelo.Personaje;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.Utilidad;

/**
 *
 * @author Danny Franco
 */
public class ControladorForm extends HttpServlet {

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

        String op = request.getParameter("accion");
        System.out.println("ENTRA EN CONTROLADOR FORMULARIO CON ACCION " + op);

//        Transaction transaction = null;
//        Session session = Utilidad.getSessionFactory().openSession();
        try {
            Session session = Utilidad.getSessionFactory().openSession();
            if (op.equals("alta")) {
                //vista
                response.sendRedirect("formulario.jsp");

            } else if (op.equals("listado")) {
                response.sendRedirect("lista.jsp");

            } else if (op.equals("inserir")) {
                try {
                    System.out.println("ENTRA EN INSERIR");
                    Transaction transaction = null;
                    // Session session = Utilidad.getSessionFactory().openSession();
                    transaction = session.beginTransaction();
                    Personaje personaje = (Personaje) request.getAttribute("perso");

                    Set<Pelicula> peliculas = new HashSet<Pelicula>();
                    
                    System.out.println("ENTRA PELICULA 1 " + request.getParameter("nomPeli1"));
                    peliculas.add(new Pelicula(request.getParameter("nomPeli1"), personaje));
                    personaje.setPeliculas(peliculas);

                    System.out.println("ENTRA PELICULA 2 " + request.getParameter("nomPeli2"));
                    peliculas.add(new Pelicula(request.getParameter("nomPeli2"), personaje));
                    personaje.setPeliculas(peliculas);

                    session.save(personaje);
                    transaction.commit();
                    session.flush();
                    System.out.println("GRABA!!!!!!");
                    response.sendRedirect("index.jsp");
                } catch (Exception e) {
                    System.out.println("NO GRABA!!!!!!");

                }
                //  RequestDispatcher rd = request.getRequestDispatcher("formulario.jsp");
            } else if (op.equals("listadoPersonaje")) {
                //consulta a la bd a traves d'Hibernate
                session.beginTransaction();
                Query query = session.createQuery("from Personaje");
                List<Personaje> list = query.list();
                session.getTransaction().commit();
                request.setAttribute("personaje", list);
                RequestDispatcher rd = request.getRequestDispatcher("listadoPersonaje.jsp");
                rd.forward(request, response);

            } else if (op.equals("listadoPelicula")) {
                session.beginTransaction();
                Query query = session.createQuery("from Pelicula");
                List<Pelicula> list = query.list();
                session.getTransaction().commit();
                request.setAttribute("pelicula", list);
                RequestDispatcher rd = request.getRequestDispatcher("listadoPelicula.jsp");
                rd.forward(request, response);

            } else if (op.equals("eliminarPersonaje")) {
                response.sendRedirect("eliminarPersonaje.jsp");

            } else if (op.equals("eliminarPelicula")) {
                response.sendRedirect("eliminarPelicula.jsp");

            } else if (op.equals("delete")) {

                String id = request.getParameter("idPersonaje");
                //consulta a la bd a traves d'Hibernate
                session.beginTransaction();
                Query query = session.createQuery("delete Personaje where id = :ID");
                query.setParameter("ID", new Integer(Integer.parseInt(id)));
                int result = query.executeUpdate();
                session.getTransaction().commit();
                response.sendRedirect("index.jsp");
            } else if (op.equals("deletePeli")) {

                String id = request.getParameter("idPelicula");
                //consulta a la bd a traves d'Hibernate
                session.beginTransaction();
                Query query = session.createQuery("delete Pelicula where id = :ID");
                query.setParameter("ID", new Integer(Integer.parseInt(id)));
                int result = query.executeUpdate();
                session.getTransaction().commit();
                response.sendRedirect("index.jsp");
            }

        } catch (RuntimeException e) {
            System.out.println("PROBLEMAS!!!!!! " + e);

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
        response.setContentType("text/html;charset=UTF-8");
//
//        PrintWriter out = response.getWriter();
//
//        String op = request.getParameter("accion");
//        System.out.println("ENTRA EN CONTROLADOR FORMULARIO SIN ACCION " + op);
//
//        Transaction transaction = null;
//        Session session = Utilidad.getSessionFactory().openSession();
//        try {
//            transaction = session.beginTransaction();
//            Personaje personaje = (Personaje) request.getAttribute("perso");
//
//            Set<Pelicula> peliculas = new HashSet<Pelicula>();
//            peliculas.add(new Pelicula(request.getParameter("nomPeli1"), personaje));
//            personaje.setPeliculas(peliculas);
//
//            if (request.getParameter("nomPeli2") != null) {
//                peliculas.add(new Pelicula(request.getParameter("nomPeli2"), personaje));
//                personaje.setPeliculas(peliculas);
//            }
//
//            session.save(personaje);
//            transaction.commit();
//            session.flush();
//
//            System.out.println("GRABA!!!!!!");
//            out.println("GRABA Datos insertados !!!!!!");
//
//            RequestDispatcher rd = request.getRequestDispatcher("formulario.jsp");
//        } catch (RuntimeException e) {
//            System.out.println("NO GRABA!!!!!! " + e);
//
//        }

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
