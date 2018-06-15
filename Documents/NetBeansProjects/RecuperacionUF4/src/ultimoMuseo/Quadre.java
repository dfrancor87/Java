/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimoMuseo;

/**
 *
 * @author Danny Franco
 */
public class Quadre extends Obra implements Comparable {

    private static int codi = 10000;
    private int alt;
    private int ample;

    public Quadre(int alt, int ample, String nom, String autor) {
        super(nom, autor);
        this.alt = alt;
        this.ample = ample;
    }

    public Quadre(int alt, int ample, String nom) {
        super(nom);
        this.alt = alt;
        this.ample = ample;
    }

    @Override
    public int nouCodi() {
        this.codi++;
        return this.codi;
    }

    @Override
    public int compareTo(Object t) {

        // hacemos un Casting del parametro recibido
        // 
        Quadre c2 = (Quadre) t;

        return this.getNom().compareTo(c2.getNom());
    }
}


