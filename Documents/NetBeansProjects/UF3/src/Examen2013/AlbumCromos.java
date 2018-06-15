
package Examen2013;

import java.io.Serializable;

/**
 * (2 punts) Crea una classe AlbumCromos que representi un array de Cromos. 
 * Al constructor li passaràs el nom de la col·lecció de cromos i quants cromos 
 * hi ha a la col·lecció. Escriu una funció per afegir cromos. Afegeix els altres 
 * mètodes que creguis convenients.
 * public AlbumCromos(String nom, int quants);
 * public void afegirCromo(Cromo c);
 * @author Administrador
 */
public class AlbumCromos implements Serializable {
    
    String nom;
    int quants;
    Cromo [] col;
    int numCromos=0;

    public AlbumCromos(String nom, int quants) {
        this.nom = nom;
        this.quants = quants;
        
        // Creem el vector de cromos 
        col = new Cromo [quants];
    }
    
    // Funció per afegir un cromo a la col·lecció
    public void afegirCromo(Cromo c)
    {
        if (numCromos < quants)
        {
            col[numCromos] = c;
            numCromos++;
        }
    }
    
    @Override
    public String toString ()
    {
        String aux="";
        for (int i=0;i<numCromos;i++)
            aux+=col[i].toString();
        return "Nom de l'àlbum: "+nom+"\nNombre de cromos de la col·lecció: "+quants+
                "\nNombre actual de cromos: "+numCromos+"\nDades dels cromos: \n"+aux;
    }
}
