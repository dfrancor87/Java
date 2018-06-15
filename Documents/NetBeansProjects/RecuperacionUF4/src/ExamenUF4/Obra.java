/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenUF4;

/**
 *
 * @author Danny Franco
 */
public abstract class Obra {

    private int codi;
    private String nom;
    private String autor;

    private static int cont = 0;
    private static final String AUTOR_PER_DEFECTE = "ANÒNIM";

    public Obra(String nom, String autor) {
        this.nom = nom;
        this.autor = autor;
        this.codi = nouCodi();
        this.cont++;                
    }
    
    public Obra(String nom) {
        this.nom = nom;
        this.autor = AUTOR_PER_DEFECTE;
        this.codi = nouCodi();
        this.cont++;                
    }

    public static int getCont() {
        return cont;
    }

   
            
    
    public abstract int nouCodi();

    @Override
    public String toString() {
        return "nombre: " + nom + ", autor=" + autor +" codi: "+codi ;
    }
    
    
    

}
