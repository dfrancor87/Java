package colecciones;

/**
 *
 * @author Danny Franco
 */
public class Libro {

    private String titulo;
    private String autor;
    private int ISBN;

    public Libro(String titulo, String autor, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getDatos() {
        return ("Titulo: " + titulo + " Auntor:" + autor + "ISBN: " + ISBN);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Libro) {
            Libro otro = (Libro) obj; //casting 
            if (this.ISBN == otro.ISBN) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }

}
