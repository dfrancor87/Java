/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasYcercles;

/**
 *
 * @author Danny Franco
 */
public abstract class Obra {

    private String nom;
    private String autor;
    private static final String AUTOR_PER_DEFECTE="ANONIM";
    private int codi;   
    // para saber el total de obras
    private static int numObras =0;

    public Obra(String nom, String autor) {
        this.nom = nom;
        this.autor = autor;
        //codi de la quadro o escultura
        this.codi = nouCodi();
        // numObras total de obras
        this.numObras++;
       
    }
    
    
      public Obra(String nom) {
        this.nom = nom;
        this.autor = AUTOR_PER_DEFECTE;
         //codi de la quadro o escultura
        this.codi = nouCodi();
        // numObras total de obras
        this.numObras++;       
    }

     // para usarlo en la clase prova y darle codi a la escultura o qquadro     
    public int getCodi() {
        return codi;
    }

    public static int getNumObras() {
        return numObras;
    }
      
      
    public abstract int nouCodi();      

    @Override
    public String toString() {
        return "nom=" + nom + ", autor=" + autor + ", codi=" + codi;
    }
    
    
    
    
    
}


