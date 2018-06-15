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
public class Triangulo extends Figura {

    public Triangulo(PApplet pApplet, float x, float y, float radi, float color) {
        super(pApplet, x, y, radi, color);
    }

  

    // pintar y dibujar triganlo
    @Override
    public void display() {
        Figura.pApplet.fill((float) Math.random() * 255, (float) Math.random() * 255, (float) Math.random() * 255);
        pApplet.triangle(getX() + getRadi(), getY(), getX() + getRadi() / 2, getY() - getRadi(), getX(), getY());
    }

    //calcular aera
    @Override
    public double calcularArea() {
        return Math.sqrt(Math.pow(this.getRadi(), 2) - (Math.pow(this.getY(), 2) / 4));
    }

}
