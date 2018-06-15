/*
PROGRAMA QUE PIDE LA EDAD AL USUARIO Y 
QUE MUESTRE EL DESCUENTO QUE LE CORRESPONDE 
A LA ENTRADA DEL TEADRO
*/
package uf1;
import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Descuento {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int edad;
        System.out.println("PROGRAMA DESCUENTO POR EDAD");
        System.out.println("Ingresa tu edad:   ");
        edad = entrada.nextInt();
        if (edad < 0){
            System.out.println("no es una edad");
        }
        else if (edad < 6 || edad >= 65 ){
            System.out.println("Gratis");
        }
        else if ((edad >= 6 && edad <= 12) ||(edad >= 56 && edad <= 64)){
            System.out.println("50% de descuento");
         
        }
        else if (edad >= 13 && edad <= 18){
            System.out.println("25% de descuento");
        }
        else   {
        System.out.println("0% De descuento");
        }
        
    }
}
