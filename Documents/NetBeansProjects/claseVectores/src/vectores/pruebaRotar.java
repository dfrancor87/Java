/*
DANNY FRANCO
EMPAREJAMIENTO DE EQUIPOS
 */
package vectores;

import java.util.Scanner;

public class pruebaRotar {

    public static void main(String[] args) {
        System.out.println("Programa Emparejamiento de Equipos");

        int numEquipos;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nEscribe el total de equipos participantes:");
        numEquipos = entrada.nextInt();

        //vector normal
        String[] vectorTmp = new String[numEquipos];
        for (int i = 0; i < vectorTmp.length; i++) {
            System.out.println("\nIngresa el nombre del equipo ");
            vectorTmp[i] = entrada.next();
        }

        if (numEquipos % 2 == 1) {
            numEquipos+=1;
            String[] vectorImpar = new String[numEquipos];
            for (int i = 0; i < vectorTmp.length; i++) {
                if (i == numEquipos-1) {
                    vectorImpar[i] = "NOJUEGA";
                }
                vectorImpar[i] = vectorTmp[i];

            }
            for (int i = 0; i < vectorImpar.length; i++) {
                System.out.println(vectorImpar[i]);
            }

        }
    }

}
