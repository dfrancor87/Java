package cercles;

import processing.core.PApplet;

/**
 *
 * @author Hanhan
 */
public abstract class Figura {

    private int radi;
    private float color;
    protected static PApplet pApplet;

    /**
     * Constructor con par·metro objeto Papplet
     *
     * @param pApplet
     */
    public Figura(PApplet pApplet) {
        this.pApplet = pApplet;
    }

    /**
     * Constructor con par·metros de las figuras
     *
     * @param pApplet
     * @param x
     * @param y
     * @param color
     * @param radi
     */
    public Figura(PApplet pApplet,  float color, int radi) {
        Figura.pApplet = pApplet;
        this.color = color;
        this.radi = radi;
    }


    /**
     * metodo para mostrar figuras
     *
     * @return double Retorna valor del area
     */
    public abstract void mostrar(int x, int y);

    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }

    public static PApplet getpApplet() {
        return pApplet;
    }

    public static void setpApplet(PApplet pApplet) {
        Figura.pApplet = pApplet;
    }

    public float getColor() {
        return color;
    }

    public void setColor(float color) {
        this.color = color;
    }
    
    

}
