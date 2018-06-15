
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class multiplos {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num1, num2, aux;
        System.out.println("numero1");
        num1 = entrada.nextInt();
        System.out.println("numero2");
        num2 = entrada.nextInt();
        if (num1 > num2){
            aux=num1;
            num1=num2;
            num2=aux;
        }
            while (num1 <= num2){
                if (num1 % 3==0){
                    System.out.println(num1);
                }
                num1++;
            }
        
    }
}
