package pong;

import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public class Raqueta {

    /* Ancho y altura de la raqueta
    * atributo estatico que es la apliacacion 
    * sobre la que se situa la raqueta
     */
    PApplet parent;

    private float alto;
    private float ancho;

    private float posicion = 350;
    float y=350;

    //constructor    
    Raqueta(PApplet parent) {

        this.parent = parent;
        this.alto = 80;
        this.ancho = 15;
        this.posicion = posicion;
        this.y=y;
    }

    public float getAlto() {
        return alto;
    }

    public float getAncho() {
        return ancho;
    }

    public float getPosicion() {
        return posicion;
    }

    // función para mover la raqueta con el ratón
    public void moverConRaton() {
        posicion = parent.mouseY;
    }

    //Función para mover la raqueta con el teclado
    public void moverConTeclado() {
    }

    //Función para visualizar la raqueta 
    public void display() {
        parent.rect(posicion, posicion - 150, ancho, alto);
    }
}
