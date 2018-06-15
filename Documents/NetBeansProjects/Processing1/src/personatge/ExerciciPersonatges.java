package personatge;

import processing.core.PApplet;
import processing.core.PImage;

public class ExerciciPersonatges extends PApplet {

    private Personatge pers, pers2;

    //settings per dimensionar la finestra que es visualitza, el PApplet    
    @Override
    public void settings() {
        size(500, 500);
    }

    //per inicialitzar objectes i característiques del PApplet
    @Override
    public void setup() {
        background(20);  //només funciona a setup(), no a settings()
        //instanciem els objectes
        pers2 = new Personatge(250, 200, "C:\\Users\\Danfer\\Documents\\NetBeansProjects\\Processing1\\gafas.png", 5, 20);
        pers = new Personatge(100, 5, "C:\\Users\\Danfer\\Documents\\NetBeansProjects\\Processing1\\xx.png", 2);

        //cridem a la funció per visualitzar per primera vegada
        pers.display();
        pers2.display();
    }

    //mètode que s'executa sempre, en loop
    @Override
    public void draw() {
        pers.display();
        pers.moureVerticalment();
        pers2.display();
        pers2.moure();

    }

    //mètode per executar el PApplet. 
    //Compte amb el nom del package i el nom de la classe
    public static void main(String[] args) {
        // PApplet.main(new String[]{personatge.ProvesPersonatge.class.getName()});
        PApplet.main(new String[]{personatge.ExerciciPersonatges.class.getName()});

    }

    // classe interna Personatge perquè així pot accedir a característiques
    // de Processing sense haver de fer extends. Pot accedir a les funcions, 
    // a width, height, en aquest cas
    class Personatge {

        private int x, y;
        private PImage image;
        private int speed;
        private int color;

        //constructor
        public Personatge(int x, int y, String rutaImage, int speed) {
            this.x = x;
            this.y = y;
            this.image = loadImage(rutaImage);
            this.speed = speed;
        }

        //constructor color
        public Personatge(int x, int y, String rutaImage, int speed, int color) {
            this.x = x;
            this.y = y;
            this.image = loadImage(rutaImage);
            this.speed = speed;
            this.color = color;
        }

        public void moure() {
            x = x + speed;
            if (x > width) {
                x = 0;
            }
        }

        public void moureVerticalment() {
            y = y + speed;
            if (y > height) {
                y = 0;
            }
        }

        public void display() {
            image(image, x, y);
        }

    }
}