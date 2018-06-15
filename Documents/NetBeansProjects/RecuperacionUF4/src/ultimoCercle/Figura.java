/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimoCercle;

import Figuras.*;
import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public abstract class Figura {

    protected static PApplet pApplet;
    private float radi;
    private float color;

    public Figura(PApplet pApplet, float radi, float color) {
        Figura.pApplet = pApplet;       
        this.radi = radi;
        this.color = color;
    }

    /**
     * método abstracto para representar figuras
     */
    public abstract void mostrar(int x, int y);

    /**
     * método abstracto para calcular area de las figuraas
     *
     * @return double Retorna valor del area
     */


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
