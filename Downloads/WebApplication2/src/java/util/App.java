package util;

import java.util.List;
import model.Direcion;
import model.Profesor;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author montse
 */
public class App {
public static void main(String[] args) {
        System.out.println("Hibernate 5 + MySQL + Prova profesor y direccion");
        Session session = Utilitats.getSessionFactory().openSession();
        insertP(session);
//consultaLlibre(session);      
//updateLlibre(session);
        //queryP(session);
     // deleteLlibre(session);
      // session.close();
    }

////        Llibre llibre=new Llibre(1,"Quijote","Cervantes");
////         
////        //Get Session
////        Session session = Util.getSessionFactory().getCurrentSession();
////        //start transaction
////        session.beginTransaction();
////        //Save the Model object
////        session.save(llibre);
////        //Commit transaction
////        session.getTransaction().commit();
////        //System.out.println("Llibre ID="+llibre.getIdLlibre());
////         
////        //terminate session factory, otherwise program won't end
////        Util.getSessionFactory().close();
//
//    public static void deleteprofesor(Session session){
//        //Query q = session.createQuery("delete Entity where id = X");
//       //q.executeUpdate();
//        session.beginTransaction();
//        Profesor p1 = new Profesor(1, "Carlos", "Veizaga","Fernandez");
//        session.delete(p1);
//        session.getTransaction().commit();
//    }
//    
////    public static void consultaLlibre(Session session) {
////        Llibre book = (Llibre) session.get(Llibre.class, 2);
////        System.out.println("Llibre: " + book);
////    }
//
//    public static void updateProfessor(Session session) {
//        session.beginTransaction();
//        Profesor p1 = new Profesor(1, "Carlos", "Veizaga","Fernandez");
//        session.update(p1);
//        session.getTransaction().commit();
//    }


    public static void insertP(Session session) {
        session.beginTransaction();
        
//Llibre book = new Llibrerofesor p1 = new Profesor(1, "Carlos", "Veizaga","Fernandez");(12, "El pijoaparte", "Juan Marsé");
        Direcion d= new Direcion(2,"Progres",115,"L'hospitalet de llobregat","Barcelona");
Profesor p1 = new Profesor(2, "Raziel", "Veizaga",d);
        
        session.save(p1);
        session.getTransaction().commit();

    }

    public static void queryP(Session session) {
        session.beginTransaction();
        Query query = session.createQuery("from Profesor");
        List<Profesor> list = query.list();
        for (Profesor p : list) {
            System.out.println("Profesor: " + p.getNombre() + " " + p.getApellido1());
        }
        session.getTransaction().commit();

    }
}
