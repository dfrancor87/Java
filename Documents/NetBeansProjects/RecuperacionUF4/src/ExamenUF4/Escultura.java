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
public class Escultura extends Obra {
    
    private static int codi = 20000;
    private double pes;

    public Escultura(double pes, String nom, String autor) {
        super(nom, autor);
        this.pes = pes;
    }

    public Escultura(double pes, String nom) {
        super(nom);
        this.pes = pes;
    }
    
    
    public int nouCodi(){
        this.codi++;
        return this.codi;
    }
    
    
   
  
    
    
    
}
