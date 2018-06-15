package figuras;

import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public class Cuadrado extends Figura {

    private float radi;
    private float color;

    //constructor
    public Cuadrado(float x, float y, float radi, PApplet pApplet, float color) {
        super(x, y, radi, pApplet, color);
    }

    /**
     * Metodo para calcular el area del Cuadrado
     *
     * @return devuelve el area
     */
    public double calcularArea() {
        return (this.getRadi() * this.getRadi());
    }

    /**
     * Da color y dibuja el cuadrado
     */
    @Override
    public void display() {
        Figura.parent.fill((float) Math.random() * 255, (float) Math.random() * 255, (float) Math.random() * 255);
        Figura.parent.rect(getX(), getY(), getRadi(), getRadi());

    }
}
