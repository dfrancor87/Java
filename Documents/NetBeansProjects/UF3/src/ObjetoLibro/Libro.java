/*
257.Fer una classe Llibre per emmagatzemar les dades de la nostra bibliografia personal.
Els atributs bàsics seran el títol del llibre (titol), l’autor o autors (autors) i el ISBN
(isbn).
 */
package ObjetoLibro;

import java.io.Serializable;

/**
 *
 * @author Danfer
 */
public class Libro implements Serializable {
    private String titol ;
    private String autor;
    private int isbn;
    //contrusctor

    public Libro(String titol, String autor, int isbn) {
        this.titol = titol;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitol() {
        return titol;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

  

    @Override
    public String toString() {
        return "Libro{" + "titol=" + titol + ", autor=" + autor + ", isbn=" + isbn + '}';
    }
    
}
