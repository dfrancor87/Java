/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenUF4Processing;

import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public abstract class Figura {

    private float radi;
    private float color;

    protected static PApplet pApplet;

    public Figura(PApplet pApplet,float radi, float color) {
        Figura.pApplet = pApplet;
       
        this.radi = radi;
        this.color = color;
    }
    

    /**
     * método abstracto para representar figuras
     */
    public abstract void mostrar(int x, int y);

 
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
