
package Examen2013;

import java.io.Serializable;

/**
 * (1 punt) Crea una classe Cromo que guardi informació sobre el número de cromo, 
 * la descripció i el preu. Afegeix tots els mètodes que creguis adients.
 * @author carlos
 */
public class Cromo implements Serializable {
    
    int numero;
    String descripcio; 
    double preu;

    public Cromo(int numero, String descripcio, double preu) {
        this.numero = numero;
        this.descripcio = descripcio;
        this.preu = preu;
    }
    
    @Override
    public String toString ()
    {
        return "Cromo número: "+numero+" \tDescripció: "+descripcio+" \tPreu: "+preu+"\n";
    }
}
