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
public abstract class Obra {
    
    private String nom;
    private String autor;
    private int codi ;
    
    private static final String AUTOR_PER_DEFECTE = "ANÒNIM";
    private static int contadorObras=0;

    public Obra(String nom, String autor) {
        this.nom = nom;
        this.autor = autor;
        this.codi = nouCodi();
        this.contadorObras++;
    }

    public Obra(String nom) {
        this.nom = nom;
        this.autor = AUTOR_PER_DEFECTE;
        this.codi = nouCodi();
        this.contadorObras++;
    }

    public String getNom() {
        return nom;
    }

    public int getCodi() {
        return codi;
    }

    public static int getContadorObras() {
        return contadorObras;
    }
    
            
    
    public abstract int nouCodi();

    @Override
    public String toString() {
        return "nom=" + nom + ", autor=" + autor + ", codi=" + codi;
    }
    
    
    
}
