/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparableComparator;

import java.util.Arrays;

/**
 *
 * @author Danny Franco
 */
public class ProvaCoche {

    public static void main(String[] args) {
        Coche[] array = new Coche[5];

        array[0] = new Coche("Ferrrai", 22000, 2018);
        array[1] = new Coche("Seat", 18000, 2017);
        array[2] = new Coche("Opel", 1000, 2000);
        array[3] = new Coche("Audi", 55000, 2019);
        array[4] = new Coche("Toyota", 26000, 2005);

        // ordena el array segun la clase Coche
        // en clase COche lo ordena por nombre
        Arrays.sort(array);
        System.out.println("-------POR NOMBRE");
        for (Coche c : array) {
            System.out.println(c);
        }

        System.out.println("-------POR PRECIO");
         // ordenar el array precio, para eso llamamos a la clase CochesPorPrecio
        Arrays.sort(array, new CochesPorPrecio());
        for (Coche c : array) {
            System.out.println(c);
        }

        System.out.println("-------POR AÑO");
        // ordenar el array año, para eso llamamos a la clase CochesPorAnio
        Arrays.sort(array, new CochesPorAnio());
        for (Coche c : array) {
            System.out.println(c);
        }
        
        System.out.println("------POR ID");
        Arrays.sort(array, new CochesPorId());
         for (Coche c : array) {
            System.out.println(c);
        }

    }

}
