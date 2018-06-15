package figuras;

import java.util.Arrays;
import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public class Proves extends PApplet {

    public static void main(String[] args) {
        PApplet.main(new String[]{figuras.Proves.class.getName()});
    }

    private float radi;
    private float x;
    private float y;
    private float color;

    public void settings() {
        size(500, 500);
    }

    @Override
    public void setup() {

        background(255);
        //array de circulo
        Circulo[] arrayCir = new Circulo[5];
        arrayCir[0] = new Circulo((float) Math.random() * 100, this, 123);
        arrayCir[1] = new Circulo((float) Math.random() * 50, this, 123);
        arrayCir[2] = new Circulo((float) Math.random() * 50, this, 123);
        arrayCir[3] = new Circulo((float) Math.random() * 50, this, 123);
        arrayCir[4] = new Circulo((float) Math.random() * 50, this, 123);

        arrayCir[0].display();
        arrayCir[1].display();
        arrayCir[2].display();
        arrayCir[3].display();
    }
}
