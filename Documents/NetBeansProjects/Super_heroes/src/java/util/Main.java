package util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import modelo.Pelicula;
import modelo.Personaje;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Danny Franco
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("De uno a muchos");
        Session session = Utilidad.getSessionFactory().openSession();
        insertarPersonajePelicula(session);

        //queryHeroe(session);
    }

    public static void insertarPersonajePelicula(Session session) {
        session.beginTransaction();

        Personaje personaje = new Personaje("Peter Parker", "Spiderman");
        Set<Pelicula> peliculas = new HashSet<Pelicula>();
        peliculas.add(new Pelicula("Spiderman 1", personaje));
        peliculas.add(new Pelicula("Spiderman y Venom", personaje));
        
        personaje.setPeliculas(peliculas);

        session.save(personaje);
        session.getTransaction().commit();
        session.close();
    }

    public static void queryHeroe(Session session) {
        session.beginTransaction();
        Query query = session.createQuery("from Personaje");//tablas nombre de la clase
        List<Personaje> list = query.list();
        for (Personaje p : list) {
            System.out.println("Super Heroe: " + p.getNombre() + " " + p.getPeliculas());
        }
        session.getTransaction().commit();

    }

    /*
    public static void queryLlibres(Session session) {
        session.beginTransaction();
        Query query = session.createQuery("from Llibre");
        List<Llibre> list = query.list();
        for (Llibre book : list) {
            System.out.println("Llibre: " + book.getAutor() + " " + book.getTitol());
        }
        session.getTransaction().commit();

    }
     */
}
