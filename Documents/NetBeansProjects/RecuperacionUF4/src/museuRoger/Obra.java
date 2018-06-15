/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package museuRoger;

/**
 *
 * @author Roger Duñó
 */
public abstract class Obra {
    private String nom;
    private String autor;
    protected int codi;
    private static int cont=0;
    public static final String AUTOR_PER_DEFECTE = "ANÒNIM";
    
    public Obra(String nom){
        this.autor=AUTOR_PER_DEFECTE;
        this.nom=nom;
        this.codi=nouCodi();
        cont++;
    }
    
    public Obra(String nom, String autor){
        this.autor=autor;
        this.nom=nom;
        this.codi=nouCodi();
        cont++;
    }

    public static int getCont() {
        return cont;
    }
    
    public abstract int nouCodi();

    @Override
    public String toString() {
        return "El nom de la obra és: " + nom + ", l'autor és: " + autor + ", i el codi és: " + codi + '.';
    }

    
}
