package figuras;

import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public class Circulo extends Figura {

    private float radi;
    private float color;

    public Circulo(float x, float y, float radi, PApplet papplet, float color) {
        super(x, y, radi, papplet, color);
    }

    /**
     * da color y dibuja el circulo
     */
    @Override
    public void display() {
        Figura.parent.fill((float) Math.random() * 255, (float) Math.random() * 255, (float) Math.random() * 255);
        Figura.parent.ellipse(getX(), getY(), getRadi(), getRadi());
    }

    /**
     * Metodo para calcular el area del circulo
     *
     * @return devuelve el area
     */
    public double calcularArea() {
        return 3.14 * this.getRadi() * this.getRadi();
    }
}
