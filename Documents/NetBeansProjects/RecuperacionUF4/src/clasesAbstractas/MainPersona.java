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
public class MainPersona {
    public static void main(String[] args) {
        Persona [] lasPersonas = new Persona[2];
        
        lasPersonas[0] = new Empleado("Luis Conde", 50000, 2009, 02, 25);
        lasPersonas[1]= new Alumno("Ana López","Biológicas");
        
        for(Persona p: lasPersonas){
            System.out.println(p.dameNombre()+", "+p.toString());
        }
    }
}
