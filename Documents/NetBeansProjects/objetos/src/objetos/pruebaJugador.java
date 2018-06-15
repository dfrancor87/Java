//mostrar jugadres que tienen mas de una edad 
//buscar un dorsal en concreto
//mostrar los titutlares

/*
SETTER
MOSTRAR LOS DATOS DEL JUGADOR DE MENOR EDAD, INCREMENTAR SU EDAD EN UN AÑO Y VOLVER A MOSTRARLO
MOSTRAR EL JUGADOR CON EL DORSAL 10 SI EXISTE "BUSQUEDA!
MOSTRAR SOLO EL NOMBRE DEL JUGADOR DE MAS EDAD

 */
package objetos;

import java.util.*;

public class pruebaJugador {

    public static void main(String[] args) {
        jugador[] vectorJugadores = new jugador[5];
        vectorJugadores[0] = new jugador("Cristiano Ronaldo", 7, "Delantero", 32, true);
        vectorJugadores[1] = new jugador("Lionel Messi", 10, "Delantero", 29, true);
        vectorJugadores[2] = new jugador("Andres Iniesta", 8, "Meiocampista", 28, false);
        vectorJugadores[3] = new jugador("Fernando Pinillo", 4, "Defensa", 19, true);
        vectorJugadores[4] = new jugador("Fernando Alonso", 1, "Portero", 35, false);
        //MOSTAR TODO EL VECTOR
        for (int i = 0; i < vectorJugadores.length; i++) {

            System.out.println(vectorJugadores[i]);
        }
        System.out.println("\n\n");
        //MOSTRAR LOS QUE SON TITULARES
        //vectorJugadores[i] != null cuando el vector no esta lleno y hay valores NULL
        /*   for (int i = 0; vectorJugadores[i] != null; i++) {
            if (vectorJugadores[i].isTitular() == true) {
                System.out.println(vectorJugadores[i]);
            }
        }*/
        //mostrar jugadres que tienen mas de una edad 
        //vectorJugadores.length cuando el vector esta lleno
        System.out.println("--------------------------------");
        /*   int edad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Jugadores a partir de que edad?");
        edad = entrada.nextInt();
        for (int i = 0; i < vectorJugadores.length; i++) {
            if (vectorJugadores[i].getEdad() > edad) {
                System.out.println(vectorJugadores[i]);
            }
        }*/
        //MOSTRAR LOS DATOS DEL JUGADOR DE MENOR EDAD, INCREMENTAR SU EDAD EN UN AÑO Y VOLVER A MOSTRARLO
        System.out.println("--------------------------------");
        int menor;
        menor = vectorJugadores[0].getEdad();
        //BUSCAR EL DE MENOR EDAD
        for (int i = 0; i < vectorJugadores.length; i++) {
            if (vectorJugadores[i].getEdad() < menor) {
                menor = vectorJugadores[i].getEdad();
            }

        }
        //MOSTRAR EL DE MENOR EDAD
        for (int i = 0; i < vectorJugadores.length; i++) {
            if (vectorJugadores[i].getEdad() == menor) {
                System.out.println(vectorJugadores[i]);
            }
        }

        //AUMENTAR LA EDAD DEL MENOR
        for (int i = 0; i < vectorJugadores.length; i++) {
            if (vectorJugadores[i].getEdad() == menor) {
                vectorJugadores[i].setEdad(menor + 1);
            }
        }
        //MOSTRAR LA EDAD MODIFICADA
        for (int i = 0; i < vectorJugadores.length; i++) {
            if (vectorJugadores[i].getEdad() == menor + 1) {
                System.out.println(vectorJugadores[i]);
            }
        }

        //MOSTRAR EL JUGADOR CON EL DORSAL 10 SI EXISTE "BUSQUEDA!
        System.out.println("--------------------------------");
        int index = 0;
        while (vectorJugadores[index].getDorsal() != 10) {
            index++;
        }
        System.out.println(vectorJugadores[index]);
        
        //BUSCAR EL DE MAYOR EDAD
         System.out.println("--------------------------------");
         int mayor= vectorJugadores[0].getEdad();
         for(int i=0; i < vectorJugadores.length; i++){
             if (vectorJugadores[i].getEdad()>mayor){
                 mayor= vectorJugadores[i].getEdad();
             }       
         }
         //MOSTRA SOLO EL NOMBRE DEL MAYOR
         for(int i=0; i < vectorJugadores.length; i++){
             if (vectorJugadores[i].getEdad()==mayor){
               
                 System.out.println(vectorJugadores[i].getNom());
             }       
         }
    }
}



