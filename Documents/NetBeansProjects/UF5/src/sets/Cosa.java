/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sets;

/**
 *
 * @author Danny Franco
 */
public class Cosa implements Comparable<Cosa>{

    private int id;
    private String nom;

    public Cosa(int i, String n) {
        id = i;
        nom = n;
    }

    @Override
    public String toString() {
        return "Cosa{" + "id=" + id + ", nom=" + nom + '}';
    }

    //ordenadr por id y despues por nombre
    @Override
    public int compareTo(Cosa t) {
        int resultat = id - t.id;
        if (resultat == 0) {
            resultat = nom.compareTo(t.nom);
        }
        return resultat;
    }

}
