/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public class Quadrat extends Figura {

    public Quadrat(PApplet pApplet, float x, float y, float radi, float color) {
        super(pApplet, x, y, radi, color);
    }

  
    
    public void display(){
        // fill para pintar el cuadro
        Figura.pApplet.fill((float) Math.random() * 255, (float) Math.random() * 255, (float) Math.random() * 255);
        // formar cuadro
        Figura.pApplet.rect(this.getX(), this.getY(), this.getRadi(), this.getRadi());
        
    }
    
    public double calcularArea(){
        return this.getRadi() * this.getRadi();
    }
    
}
