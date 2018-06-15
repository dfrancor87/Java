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
public class Pelota {

    float x = 150, y = 150; // posicion inicial de la pelota
    int radio = 10;
    PApplet parent;

    public Pelota(PApplet p) {
        parent = p;
    }

    public float getX() {
        return x;
    }

    public int getRadio() {
        return radio;
    }

    // mover pelota
    public void mover(){
        x++;
        y++;
    }
    
      /**
     * ellipse(x coordenada, y cooordenada, diametro, altura);
     * @see https://processing.org/reference/ellipse_.html
     */
    public void display (){
        parent.ellipse(x, y, radio, radio);
    }
}
