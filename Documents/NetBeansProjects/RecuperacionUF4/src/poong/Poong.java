/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poong;

import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public class Poong extends PApplet {

    //variables global de esta clase
    Raqueta raqueta;
    Pelota pelota;
    
    public static void main(String[] args) {
        //nombre del paquuete y nombre de la clase
        PApplet.main("poong.Poong");
    }

    /*
    sobreescribir el método settings
    dibuja la ventana y su tamaño
     */
    public void settings() {
        size(500, 500);
    }

    //iniciar clases
    public void setup() {
        //instanciar clases
        raqueta =new Raqueta(this);
        pelota = new Pelota(this);
        
    }
    
    /*
    metodo draw()  es un bulce infinito
    */
    public void draw(){
        // color de fondo
        background(0);
        
        raqueta.display();
        raqueta.moverRaton();
        pelota.display();
        pelota.mover();
        
        
        // aqui se llaman a las funciones para que se muestren
    }

}
