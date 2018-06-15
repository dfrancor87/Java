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
public class Alumno extends Persona{
    
    private String carrera;
    
    public Alumno(String nom, String car){
        super(nom);
        this.carrera = car;
    }
    
    // IMPORTANTE al heredar de Persona que es abstracta
    // estamos obligados a sobreescribir el metodo abstracto
    // agregar @Override
    @Override
    public String toString(){
        return "La carrera que estudia es "+this.carrera;
    }
}
