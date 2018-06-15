/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Danfer
 */
public class PruebaLletra {

    public static void main(String[] args) {
        Lletra[] vectorLetras = new Lletra[5];
        vectorLetras[0] = new Lletra("Calibri", 8, "Negre", false);
        vectorLetras[1] = new Lletra("Arial", 11, "Blau", true);
        vectorLetras[2] = new Lletra("Times New Roman", 12, "Grog", true);
        vectorLetras[3] = new Lletra("Courier", 6, "Toranja", true);
        vectorLetras[4] = new Lletra("Symbol", 10.5, "Negre", false);
        /*
        for (int i = 0; i < vectorLetras.length; i++) {
            System.out.println(vectorLetras[i]);
            
        }*/
        //Grabar
        System.out.println("====Grabar a disco=======");
        String ruta = "lletres.dat";
        PruebaLletra fichero = new PruebaLletra();
        fichero.grabar(vectorLetras, ruta);
        System.out.println("Fichero " + ruta + " Guardado\n");

        //Leer de lletrrs.dat mostras las que esten con negreta
        //leer el vector objeto que hemos guardado    
        /*System.out.println("=====Mostrar negrita======");
        Object[] contenido = (Object[]) fichero.leer(ruta);

        for (int i = 0; i < contenido.length; i++) {                       
            System.out.println(contenido[i]);
        }*/
        
        //correccio
        //recuperar
        Lletra [] negritas = leerVector();
        for (int i = 0; i < negritas.length; i++) {
            if(negritas[i].isBold()){//cambiar
                System.out.println(negritas[i]);
            }
            
        }
        //System.out.println(negritas.length);
      
       

    }
    //funcion recuperar
    public static Lletra [] leerVector() {//FUNCION PARA LEER       
        Lletra [] vector = null;
        try {
            FileInputStream file = new FileInputStream("lletres.dat");
            ObjectInputStream ois = new ObjectInputStream(file);            
            
            // Llegim tot el vector de lletres en una única operació
            vector = (Lletra []) ois.readObject();            
            
            
            ois.close();
            file.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return vector;
    }

    //Funcion Grabar
    public void grabar(Object obj, String ruta) {
        try {
            FileOutputStream file = new FileOutputStream(ruta);
            ObjectOutputStream oos = new ObjectOutputStream(file);
            oos.writeObject(obj);
            oos.close();
            file.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}
