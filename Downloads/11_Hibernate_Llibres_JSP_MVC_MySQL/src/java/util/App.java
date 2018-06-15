package util;

import java.util.List;
import model.Llibre;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author montse
 */
public class App {
public static void main(String[] args) {
        System.out.println("Hibernate 5 + MySQL + Prova llibres");
        Session session = Utilitats.getSessionFactory().openSession();
     //   insertLlibre(session);
//consultaLlibre(session);      
//updateLlibre(session);
        queryLlibres(session);
     // deleteLlibre(session);
      // session.close();
    }

//        Llibre llibre=new Llibre(1,"Quijote","Cervantes");
//         
//        //Get Session
//        Session session = Util.getSessionFactory().getCurrentSession();
//        //start transaction
//        session.beginTransaction();
//        //Save the Model object
//        session.save(llibre);
//        //Commit transaction
//        session.getTransaction().commit();
//        //System.out.println("Llibre ID="+llibre.getIdLlibre());
//         
//        //terminate session factory, otherwise program won't end
//        Util.getSessionFactory().close();

    public static void deleteLlibre(Session session){
        //Query q = session.createQuery("delete Entity where id = X");
       //q.executeUpdate();
        session.beginTransaction();
        Llibre book = new Llibre(1, "Don Quijote de la Mancha", "Cervantes");
        session.delete(book);
        session.getTransaction().commit();
    }
    
//    public static void consultaLlibre(Session session) {
//        Llibre book = (Llibre) session.get(Llibre.class, 2);
//        System.out.println("Llibre: " + book);
//    }

    public static void updateLlibre(Session session) {
        session.beginTransaction();
        Llibre book = new Llibre(1, "Don Quijote de la Mancha", "Cervantes");
        session.update(book);
        session.getTransaction().commit();
    }


    public static void insertLlibre(Session session) {
        session.beginTransaction();
        //Llibre book = new Llibre(12, "El pijoaparte", "Juan Marsé");
        Llibre book = new Llibre(1, "Don Quijote de la Mancha", "Cervantes");
        session.save(book);
        session.getTransaction().commit();

    }

    public static void queryLlibres(Session session) {
        session.beginTransaction();
        Query query = session.createQuery("from Llibre");
        List<Llibre> list = query.list();
        for (Llibre book : list) {
            System.out.println("Llibre: " + book.getAutor() + " " + book.getTitol());
        }
        session.getTransaction().commit();

    }
}
