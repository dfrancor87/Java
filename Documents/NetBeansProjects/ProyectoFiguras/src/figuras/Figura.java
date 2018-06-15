package figuras;

import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public abstract class Figura {

    protected static PApplet parent;
    private float x;
    private float y;
    private float radi;
    private float color;

    public Figura(PApplet p) {
        parent = p;
    }

    public Figura(float x, float y, float radi, PApplet papplet, float color) {
        this.x = x;
        this.y = y;
        this.radi = radi;
        this.parent = papplet;
        this.color = color;

    }

    public static PApplet getParent() {
        return parent;
    }

    public float getRadi() {
        return radi;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getColor() {
        return color;
    }

    public static void setParent(PApplet parent) {
        Figura.parent = parent;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadi(float radi) {
        this.radi = radi;
    }

    public void setColor(float color) {
        this.color = color;
    }

    public abstract void display();

    public abstract double calcularArea();

}
