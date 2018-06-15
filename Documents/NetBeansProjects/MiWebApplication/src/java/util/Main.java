package util;

import java.util.List;
import model.Direccion;
import model.Profesor;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author montse
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hibernate 5 + MySQL + Prova profesor y direccion");
        Session session = Utilitat.getSessionFactory().openSession();
        //insertP(session);

        queryP(session);
    }

    public static void insertP(Session session) {
        session.beginTransaction();

//Llibre book = new Llibrerofesor p1 = new Profesor(1, "Carlos", "Veizaga","Fernandez");(12, "El pijoaparte", "Juan Marsé");
        Direccion d = new Direccion(4, "Progres", 115, "bcn", "Barcelona");
        Profesor p1 = new Profesor(4, "Raziel", "Veizaga", d);

        session.save(p1);
        session.getTransaction().commit();

    }

    public static void queryP(Session session) {
        session.beginTransaction();
        Query query = session.createQuery("from Profesor");
        List<Profesor> list = query.list();
        for (Profesor p : list) {
            System.out.println("Profesor: " + p.getNombre() + " " + p.getApe1());
        }
        session.getTransaction().commit();

    }
}
