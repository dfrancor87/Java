package pong;
import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public class Pilota {
    
    private static PApplet parent;
    
    private float x, y; // posicion de la pelota, en el centro 200
    private float radio;// para dibujar la pelota con la funcion ellipse
    private int velX, velY; //velociodad pelota

    
    int rebote;//contador de cuantas veces la pelota rebota en la raqueta

    //constructor
    public Pilota(PApplet parent) {
        this.parent=parent;
        this.x = 50;
        this.y = 50;
        this.radio = 20;
        this.velX = 2;
        this.velY = 2;

    }
    //metodo que dibuja la pelota x,y = posicion, radio 
    public void display() {
       parent.ellipse(x, y, radio, radio);
    }

    public float getX() {
        return x;
    }

    public float getRadio() {
        return radio;
    }

   
    
    

    public void moure() {
        x = x + velX;
        y = y + velY;

        if ((x > 400) || (x < 0)) {
            velX =- velX ;
        }
        if ((y > 400) || (y < 0)) {
            velY =- velY ;
        }
    }

}
