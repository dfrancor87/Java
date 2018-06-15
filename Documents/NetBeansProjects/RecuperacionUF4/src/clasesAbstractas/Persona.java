/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesAbstractas;

/**
 *
 * @author Danny Franco
 */
public abstract class Persona {
    
    private String nombre;
    
    public Persona(String nom){
        this.nombre = nom;
    }
    
    public String dameNombre(){
        return this.nombre;
    }
    
    public abstract String toString();

   
    
        
    
}
