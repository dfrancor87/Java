/*

3ero programa  HACER EL PROGRAMA DE ADIVINAR EL NUMERO
Generar un numero aleatorio en entre 0 y 100
EL PROGRAMA GENERA UN NUMERO ENTRE 0 Y 100 Y PREGUNTA AL 
USUARIO HASTA Q ACIERTE EL NUMERO, INCICANDOLE CUANDO SE PASA O SE QUEDA CORTO
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class AdvinaNumero {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroAleatorio, numero, cont;
        cont=0;
        numeroAleatorio = (int) (Math.random() * 101);//numero aleatorio de 0 a 100
        //System.out.println(numeroAleatorio);
        System.out.println("INGRESA UN NUMERO");
        numero = entrada.nextInt();
        cont++;
        
         while (numero != numeroAleatorio){
                if (numero > numeroAleatorio) {
                    System.out.println("Te has pasado");
                    System.out.println("INGRESA OTRO NUMERO");
                    numero = entrada.nextInt();
                    
            }  else {
                    System.out.println("Te has quedado corto");
                    System.out.println("INGRESA OTRO NUMERO");
                    numero = entrada.nextInt();
           
            }
            
            cont++;
        }

        System.out.println("HAS ACERTADO. NUMERO INGRESADO " + numero + " NUMERO ALEATORIO " + numeroAleatorio);
        System.out.println("En "+cont+" intentos");
    }

}
