
package uf1;
import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class ElDeEnmedio {
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Ingresa número 1:    ");
        num1 = Entrada.nextInt();
        System.out.println("Ingresa número 2:    ");
        num2 = Entrada.nextInt();
        System.out.println("Ingresar número 3:   ");
        num3 = Entrada.nextInt();
        //if (num1 == num2 && num3 == num2) {
        //   System.out.println("Los numeros son iguales");
        if (num1 >= num2 && num1 <=num3 ) {
            System.out.println("El de enmedio es: " + num1);

        } else if (num2 >= num1 && num2 <= num3) {
            System.out.println("EL de enmedio es:  " + num2);
        } else {
            System.out.println("El de enmedio es: " + num3);
        
    }

    }   
}
