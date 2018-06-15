package figuras;

import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public class Triangulo extends Figura {

    private float color;
    private float x;
    private float y;
    private float radi;

    
    public Triangulo(float x, float y,float radi, PApplet papplet, float color) {
      super(x, y, radi, papplet, color);
    }
/**
 * Funciin qeu calcula el area del triangulo
 * @return devuelve el area
 */
    public double calcularArea() {
        return ((this.getRadi() * this.getRadi()) /2);
    }
/**
 * da color y dibuja el triangulo
 */
    @Override
    public void display() {
        Figura.parent.fill((float) Math.random() * 255, (float) Math.random() * 255, (float) Math.random() * 255);
      //  Figura.parent.triangle(getX(), getY(), getX(), getY(),getX(), getY());
        Figura.parent.triangle(getX() + getRadi(), getY(), getX() + getRadi() / 2, getY() - getRadi(), getX(), getY());

    }
}
