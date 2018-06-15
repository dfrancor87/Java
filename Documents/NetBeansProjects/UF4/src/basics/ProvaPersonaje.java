package basics;
/**
 *
 * @author Danny Franco
 */
import java.util.Scanner;

public class ProvaPersonaje {

    public static void main(String[] args) {
        //constructor sin parametro
        Personaje i;
        i = new Personaje("Indiana", 0, 0, 50.00, "Brujula");
        Personaje p;
        p = new Personaje("Pepito", 1, 3, 30.00, "");

        p.moverDerecha();
        p.moverIzquierda();
        p.moverIzquierda();
        p.moverIzquierda();
        p.darDinero(i, p.getDinero()/2);
        //indiana le deja objeto a pepito
        i.dejaObjeto(p);
        System.out.println(p);
        System.out.println(i);
        //Indiana se desplaza (5,5)
        i.moverAbajo();
        i.moverAbajo();
        i.moverAbajo();
        i.moverAbajo();
        i.moverAbajo();
        i.moverArriba();
        i.moverArriba();
        i.moverArriba();
        i.moverArriba();
        i.moverArriba();
        
        i.cogerObjeto(i, "Mapa");
        System.out.println(i);
        

    }

}
