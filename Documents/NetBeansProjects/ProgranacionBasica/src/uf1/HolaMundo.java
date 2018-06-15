package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class HolaMundo {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
      //  System.out.println("HolaMundo");
      Scanner entrada = new Scanner(System.in);
      int n1;
        System.out.println("numero 1: ");
        n1=entrada.nextInt();
        System.err.println("Holaaa: "+ ++n1);
        int precio = 200;
        if(precio < 0 || precio > 50){
            System.out.println("no esa en el rango *");
        }
      
    }
    
}
