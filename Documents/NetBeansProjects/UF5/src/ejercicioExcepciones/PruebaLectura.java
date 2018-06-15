/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioExcepciones;

import java.io.FileNotFoundException;

/**
 *
 * @author Danny Franco
 */
public class PruebaLectura {

    public static void main(String[] args) throws FileNotFoundException {
       try{
           Lectura leer = new Lectura("dominis.txt");
           leer.funcio();
       }catch(FileNotFoundException e){
           System.out.println(e.getMessage());
       }

        
    }

}
