/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonajeHerencia;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class ExerciciPersonatges {
    public static void main(String[] args) {
        //Constructor sin parametros
        Persona p;
        p = new Persona();
        p.setNom("Clara");
        p.setEdad(23);
        
        Persona p2 = new Persona();
        p2.setNom("Danny");
        p2.setEdad(30);
        
        //constructor con parametros
        Persona p3 = new Persona ("Danny", 30);
        
        //Escribir por consola
//        Persona p4 = new Persona ();
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("¿Cómo te llamas?");
//        p4.setNom(entrada.next());
//        p4.setEdad(19);        
//        p4.parlar();
//        
        Programador p5= new Programador();
        p5.setNom("Danny");
        p5.setEdad(50);
        p5.setLenguaje("PHP");
        p5.parlar();
        
        
        
    }
    
}
