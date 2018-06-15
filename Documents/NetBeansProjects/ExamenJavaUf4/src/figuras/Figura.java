package figuras;

import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public abstract class Figura {

    protected static PApplet parent;
    private int x;
    private int y;
    private float radi;
    private float color;

    public Figura(PApplet p) {
        parent = p;
    }

    public Figura(float radi, PApplet papplet, float color) {
        
        x= (int) (Math.random() * 500);
        y=(int) (Math.random() * 2);
        
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
    
    public abstract void display();

    

}
