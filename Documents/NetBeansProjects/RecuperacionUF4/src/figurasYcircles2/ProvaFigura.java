/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasYcircles2;
import java.util.Arrays;
import processing.core.PApplet;
/**
 *
 * @author Danny Franco
 */
public class ProvaFigura extends PApplet{
    
    
    public static void main(String[] args) {
        PApplet.main("figurasYcircles2.ProvaFigura");
    }
    
    /**
     * Poner las medidas del marco donde pondremos las figuras
     */
    public void settings() {
        size(600, 600);
    }
    
     public void setup() {
        //instanciamos los objs con una posicion,radio y color inicial
        Cercle array[] = new Cercle[5];
        
        array[0]= new Cercle(this, 98, 50);
        array[1]= new Cercle(this, 95, 100);
        array[2]= new Cercle(this, 57, 150);
        array[3]= new Cercle(this, 33, 200);
        // numero de 20 a 100
        array[4]= new Cercle(this, (float)(Math.random()*100)+20, 250);
        
        
        Arrays.sort(array, new OrdenarPorRadio());
        
        int distanciaX = 50;
        for(Cercle c: array){
            c.mostrar(distanciaX, 150);
            distanciaX+=100;
        }
        
        // ordenar por color de rojo
        distanciaX = 50;
        for(Cercle c: array){
            c.mostrar(distanciaX, 400);
            distanciaX+=100;
        }
       
    }
    
}
