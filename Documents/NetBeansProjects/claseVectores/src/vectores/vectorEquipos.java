/*
DANNY FRANCO
EMPAREJAMIENTO DE EQUIPOS
*/
package vectores;

import java.util.Scanner;

public class vectorEquipos {

    public static void main(String[] args) {
        System.out.println("Programa Emparejamiento de Equipos");

        int numEquipos;
        Scanner entrada = new Scanner(System.in);
        //tiene que ser cifra par para continuar
        do{
        System.out.println("\nEscribe el total de equipos participantes:");
        System.out.println("Número par por ejemplo(2,4,6,8...)");
        numEquipos = entrada.nextInt();
        }while(numEquipos%2==1);

        /*VECTOR1 LA MITAD DE LOS EQUIPOS*/
        String[] vector1 = new String[numEquipos / 2];
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("\nIngresa el nombre del equipo ");
            vector1[i] = entrada.next();
        }

        String[] vector2 = new String[numEquipos / 2];
        for (int j = 0; j < vector2.length; j++) {
            System.out.println("\nIngresa el nombre del equipo ");
            vector2[j] = entrada.next();
        }
        System.out.println("\n \n");

        //JORNADA 1
        int partidos;
        partidos = numEquipos - 1;//TOTAL DE PARTIDOS A JUGAR

        //PARTIDO 1
        System.out.println("partido 1");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i] + " - " + vector2[i] + "\n");
        }

        ///RESTO DE PARTIDOS/////
        int cont = 1;// uno porque ya se ha jugado un partido
        //el while no parara hasta que llegue a los partidos que faltao  
        while (cont != partidos) {
            String ultmoEquipoV1, primerEquipoV2;
            /*GUARDA EL ULTIMO NUMERO DEL VECTOR1. vector1[vector1.length - 1]*/
            ultmoEquipoV1 = vector1[vector1.length - 1];
            /*TMP2 GUARDA EL PRIMER NUMERO DE VECTOR2. VECTOR2[0] */
            primerEquipoV2 = vector2[0];

            /*ROTAR VECTOR1*/
            for (int i = vector1.length - 1; i > 1; i--) {
                vector1[i] = vector1[i - 1];
            }
            /*INSERTA EL PRIMER EQUIPO DE VECTOR2 A LA POSICION 1 DE VECTOR1*/
            vector1[1] = primerEquipoV2;
            
            /*ROTAR EL VECTOR2*/
            for (int i = 0; i < vector2.length - 1; i++) {
                vector2[i] = vector2[i + 1];
            }
            /*INSERTA EL ULTIMO EQUIPO DE VECTOR1 AL VECTOR2*/
            vector2[vector2.length - 1] = ultmoEquipoV1;

            

            /*MUESTRA POR PANTALLA EL SIGUIENTE PARTIDO
               NUMERO DE PARTIDO CON VARIABLE CONTADOR*/
            System.out.println("\npartido " + (cont + 1));
            for (int i = 0; i < vector1.length; i++) {
                System.out.print(vector1[i] + " - " + vector2[i] + "\n");

            }
            cont++;
        }
    }

}
