//UN PROGRAMA QUE LEA EL NUMERO
//Y QUE MUESTRE QUE ESTACION DEL AÑO ES, POR EJEMPLO, ENERO - PRIMAVERA
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Estacion {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el mes (letra/número):");
        String mes = entrada.next();
        mes = mes.toLowerCase();
        if (mes.equals("enero"))
                 {
            System.out.println("Invierno");

        }
        else if (mes.equals("febrero"))
                {
            System.out.println("Invierno");
        }

    }

}
