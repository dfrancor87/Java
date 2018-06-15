/*
258.Fer una classe ProvaLlibre per a provar la classe Llibre que inicialitzi un vector amb
un conjunt de llibres i permeti després després guardar/recuperar en un fitxer tota la
nostra col·lecció. A l’hora de recuperar els llibres l’usuari podrà indicar un autor i
només es carregaran en memòria aquests.
 */
package ObjetoLibro;

/**
 *
 * @author Danfer
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PruebaLibro {

    public static void main(String[] args) {
        Libro[] vLibros = new Libro[20];
        vLibros[0] = new Libro("7 noches", "Pepe Jose", 1234567789);
        vLibros[1] = new Libro("Harry Potter", "JK", 987465123);
        vLibros[2] = new Libro("Dia 1", "Lola", 123123123);
        int index = 3;
        System.out.println("se van a guardar los datos");

        String ruta = "libros.txt";
        PruebaLibro fichero = new PruebaLibro();
        fichero.grabar(vLibros, ruta);
        //leer vector guardado
       /* Object[] contenido = (Object[]) fichero.leer(ruta);
        int i = 0;
        while (contenido[i] != null) {
            System.out.println(contenido[i]);
            i++;
        }*/
       //leer soloo autor
      
    }

    public Object leer(String ruta) {
        Object aux = null;
        try {
            FileInputStream file = new FileInputStream(ruta);
            ObjectInputStream ois = new ObjectInputStream(file);
            aux = ois.readObject();
            
            ois.close();
            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return aux;
    }

    public void grabar(Object obj, String ruta) {
        try {
            FileOutputStream file = new FileOutputStream(ruta);
            ObjectOutputStream oos = new ObjectOutputStream(file);
            oos.writeObject(obj);
            oos.close();
            file.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
