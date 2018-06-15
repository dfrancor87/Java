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
public abstract class Figura {

    private float x;
    private float y;
    private float radi;
    private float color;

    protected static PApplet pApplet;

    public Figura(PApplet pApplet, float x, float y, float radi, float color) {
        Figura.pApplet = pApplet;
        this.x = x;
        this.y = y;
        this.radi = radi;
        this.color = color;
    }
    

    /**
     * método abstracto para representar figuras
     */
    public abstract void display();

    /**
     * método abstracto para calcular area de las figuraas
     *
     * @return double Retorna valor del area
     */
    public abstract double calcularArea();

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getRadi() {
        return radi;
    }

    public void setRadi(float radi) {
        this.radi = radi;
    }

    public float getColor() {
        return color;
    }

    public void setColor(float color) {
        this.color = color;
    }

    public static PApplet getPapllet() {
        return pApplet;
    }

    public static void setPapllet(PApplet papllet) {
        Figura.pApplet = papllet;
    }
    
    

}
