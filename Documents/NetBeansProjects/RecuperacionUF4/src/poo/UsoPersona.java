/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Danny Franco
 */
public class UsoPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona(1,"Danny", "Franco", "123456", 1987,07,13);
        
        //System.out.println(p1.getEdad());
        //p1.cambiarClave("123", "11111");
        p1.calcularEdad();
        System.out.println(p1.getEdad());
        
    }
}
