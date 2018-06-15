package pong;
import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public class Poong extends PApplet {

    //instanciar pelota y raqueta    
    Raqueta raqueta;
    Pilota pelota;
    
    //Dimensionar ventana
    @Override
    public void settings() {
        size(400, 400);
    }

    
    @Override
    public void setup() {
        background(0);
        raqueta = new Raqueta(this);
        pelota= new Pilota(this);
    }

    
    @Override
    public void draw() {
       background(0);
        raqueta.display();
        raqueta.moverConRaton();      
        pelota.display();
        pelota.moure();
        
    }

    //mètode per executar el PApplet. 
    //Compte amb el nom del package i el nom de la classe
    public static void main(String[] args) {

        PApplet.main(new String[]{pong.Poong.class.getName()});

    }

}
