package personatge;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * Primer exemple per utilitzar Processing i visualitzar objectes Veure
 * www.processing.org Cal utilitzar les llibreries 2.0 o 3.0 Moltes coses a
 * modificar
 *
 * Per practicar, nous constructors, nous atributs i noves funcionalitats.
 *
 * @author Montse
 * @version 25/9/2017
 */
public class ProvesPersonatge extends PApplet {

    private Personatge pers;

    /*OTROS DOS*/
    private Personatge p2;
    private Personatge p3;

    //settings per dimensionar la finestra que es visualitza, el PApplet
    
    @Override
    public void settings() {
        size(600, 300);
    }
    //per inicialitzar objectes i característiques del PApplet

    @Override
    public void setup() {
        // size(600, 300);
        background(255);  //només funciona a setup(), no a settings()
        //instanciem els objectes
        pers = new Personatge();
        
        //cridem a la funció per visualitzar per primera vegada
        pers.display();
        
        //pers.canviarVelocitat(2);

    }

    //mètode que s'executa sempre, en loop
    @Override

    public void draw() {
        pers.moure();
        pers.display();
    }

    //mètode per executar el PApplet. 
    //Compte amb el nom del package i el nom de la classe
    public static void main(String[] args) {
        PApplet.main(new String[]{personatge.ProvesPersonatge.class.getName()});
    }

    // classe interna Personatge perquè així pot accedir a característiques
    // de Processing sense haver de fer extends. Pot accedir a les funcions, 
    // a width, height, en aquest cas
    class Personatge {

        private int x, y;
        private int speed;
        private PImage image;
        //encara no l'utilitzem
        private int color;

        //un possible constructor per defecte, no l'únic.
        public Personatge() {
            //les imatges es carreguen des de l'arrel del projecte NetBeans
            image = loadImage("champions.png");           
            x = 50;
            y = 100;
            speed = 1;
        }
       
        
        //HACER OTRO CONSTRUCTOR
        
        

        public void canviarVelocitat(int nouSpeed) {
            speed = nouSpeed;
        }

        public void moure() {
            x = x + speed;
            if (x > width) {
                x = 0;
            }
        }

        public void display() {
            image(image, x, y);
        }
    }
}
