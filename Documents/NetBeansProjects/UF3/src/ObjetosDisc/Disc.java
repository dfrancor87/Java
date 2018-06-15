/*
255.Fer una classe Disc per emmagatzemar les dades de la nostra discografia personal.
Els atributs bàsics seran el nom del disc (nom), del cantant o grup (grup) i l'any (any)
de la publicació del disc.

 */
package ObjetosDisc;

import java.io.Serializable; //Serializacion

/**
 *
 * @author Danfer
 */
public class Disc implements Serializable {//?????
    //atributos

    private String nom;
    private String grup;
    private int any;
    private boolean seVende;

    //constructor
    public Disc(String nom, String grup, int any, boolean seVende) {
        this.nom = nom;
        this.grup = grup;
        this.any = any;
        this.seVende = seVende;
    }
    //declarar geter

    public String getNom() {
        return nom;
    }

    public String getGrup() {
        return grup;
    }

    public int getAny() {
        return any;
    }

    public boolean isSeVende() {
        return seVende;
    }

    

    // toString    
    @Override
    public String toString() {
        String salida = "Disc: " + "nom: " + nom + ", grup: " + grup + ", any: " + any;
        if (seVende) {
          return  salida += "Se vende";
        } else {
          return  salida += "No se vende";
        }
    }
}
