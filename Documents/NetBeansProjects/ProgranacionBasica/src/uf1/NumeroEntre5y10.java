/*
PEDIR AL USUARIO UN VALOR ENTRE 5 Y 10
SI NO PONE UN VALOR CORRECTO INDICARLO Y VOLVERSELO A PEDIR
HASTA QUE SEA CORRECRTO
 */
package uf1;
import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class NumeroEntre5y10 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingresa un valor entre 5 y 10");
            num = entrada.nextInt();
        }
        while(num<5 || num>10);
            //System.out.println("El numero no esta entre los limites");
            //System.out.println("Ingresa otro número");
            //num = entrada.nextInt();
        
        System.out.println("Numero correcto");
    }
}
