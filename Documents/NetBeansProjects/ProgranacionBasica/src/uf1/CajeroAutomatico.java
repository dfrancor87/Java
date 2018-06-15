/*
Hacer un programa que simule un cajero automático de un banco.
Se pedirá al usuario la cantidad y se le indicara cuantos billetes
-de 50
-de 20
-de 10
se entregaran.
si la cantidad no fuese posible conseguirla con esos 3 billetes
se mostrará un mensaje indicandolo
limite de 1000 euros.
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class CajeroAutomatico {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidad, ultimDigit;
        int b10 = 0, b20 = 0, b50 = 0, resto = 0;
        System.out.println("Cuánta plata desea retirar: ");
        cantidad = entrada.nextInt();
        ultimDigit = cantidad % 10;//Saber el último digito
        if (cantidad >= 1001 || cantidad <= 9 || ultimDigit!=0) {
            System.out.println("ERROR, el cajero no puede dar esa cantidad");
        } else {
  
             if (cantidad >= 10) {
                b50 = cantidad / 50;
                resto = cantidad % 50;
                if(b50>=1){
                System.out.println(b50 + " billites de 50");}
            }
            if (resto >= 20) {
                b20 = resto / 20;
                resto = resto % 20;

                System.out.println(b20 + " billetes de 20");
            }
            if (resto == 10) {
                b10 = resto / 10;
                resto = resto % 10;
                System.out.println(b10 + " billetes de 10");
            }
            
                
            }
        }
    }
