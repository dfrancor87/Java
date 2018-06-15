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
public class Cercle extends Figura {

    public Cercle(PApplet pApplet, float x, float y, float radi, float color) {
        super(pApplet,x, y, radi, color);
    }

    public void display() {
        // se hace el cast a float para darle color al ciculo
        // tiene que ser float 
        Figura.pApplet.fill((float) Math.random() * 255, (float) Math.random() * 255, (float) Math.random() * 255);
        // para dibujar el circulo, coordenadas de donde estará y su radio
        Figura.pApplet.ellipse(this.getX(), this.getY(), this.getRadi(), this.getRadi());
    }

    /**
     * implementa el m�todo calcularArea de la Figura
     */
    public double calcularArea() {
        return Math.PI * (this.getRadi() * this.getRadi());
    }

}
