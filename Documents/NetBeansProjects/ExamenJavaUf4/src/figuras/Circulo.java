package figuras;

import processing.core.PApplet;
/**
 *
 * @author Danny Franco
 */
public class Circulo extends Figura {
    private static PApplet parent;
    private float radi;
    private float color;

    public Circulo(float radi, PApplet papplet, float color) {
        super(radi, papplet, color);
    }

   
    @Override
    public void display() {
        Figura.parent.fill((float) Math.random() * 255,0,0);
        Figura.parent.ellipse(getX(), getY(), getRadi(), getRadi());
    }
}


