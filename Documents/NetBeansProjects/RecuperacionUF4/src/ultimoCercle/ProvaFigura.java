/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimoCercle;

import java.util.Arrays;
import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public class ProvaFigura extends PApplet {

    /* metrodo MAIN */
    public static void main(String[] args) {
        PApplet.main("ultimoCercle.ProvaFigura");
    }

    /**
     * Poner las medidas del marco donde pondremos las figuras
     */
    public void settings() {
        size(800, 800);
    }

    // instanciar objetos y mostrarlos por primera vez
    @Override
    public void setup() {
        Cercle array[] = new Cercle[5];
        
        // llenar el array de cercles con randon 
        for (int i = 0; i < array.length; i++) {
            array[i]= new Cercle(this, (float)(Math.random()*80)+20, (float)Math.random()*255);            
        }
        
        // mostrarlo sin array sort
//        int distanciaX=50;
//        for(Cercle c: array){
//            c.mostrar(distanciaX, 150);
//            distanciaX+=150;
//        }
        
        /// ORDENAR POR RADIO
        Arrays.sort(array, new OrdenarPorRadio() );
         int distanciaX=50;
         for(Cercle c: array){
            c.mostrar(distanciaX, 150);
            distanciaX+=150;
        }
         
         
         
         // ORDENAR POR COLOR
          Arrays.sort(array, new OrdenarPorColor());
         distanciaX =50;
         for(Cercle c: array){
             c.mostrar(distanciaX, 500);
             distanciaX+=150;
         }
         

    }

}
