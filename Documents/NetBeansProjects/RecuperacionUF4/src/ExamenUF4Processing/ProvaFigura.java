/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenUF4Processing;

import java.util.Arrays;
import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public class ProvaFigura extends PApplet {

    // hace atritubo la clase
    private Cercle array[] = new Cercle[5];

    //posiciones de donde lo queremos printar
    private float x;
    private float y;

    /* metrodo MAIN */
    public static void main(String[] args) {
        PApplet.main("ExamenUF4Processing.ProvaFigura");
    }

    public void settings() {
        size(500, 500);
    }

    public void setup(){        
                            // paplet, radio, color
        array[0] = new Cercle(this, 100, 99);
        array[1] = new Cercle(this, 50, 88);
        array[2] = new Cercle(this, 90, 66);
        array[3] = new Cercle(this, 33, 255);
        array[4] = new Cercle(this, 20, 0);
        
        Arrays.sort(array, new OrdenarPorRadio());
        int distancia =50;
        for(Cercle e: array){            
            e.mostrar(distancia, 150);
            distancia+=100;            
        }
        
        // ordenar por color
        distancia = 50;
        Arrays.sort(array, new OrdenarPorColor());
        for (Cercle c: array){
            c.mostrar(distancia, 350);
            distancia+=100;
        }
    }
    
    
   
}
