/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Danny Franco
 */
public class ProvaCotxe {

    public static void main(String[] args) {
        Cotxe[] array = new Cotxe[5];

        array[0] = new Cotxe("Panda", 2000, 1980);
        array[1] = new Cotxe("Ferrari", 500, 1970);
        array[2] = new Cotxe("Porsche", 400, 2017);
        array[3] = new Cotxe("Mercedes", 200, 1997);
        array[4] = new Cotxe("Honda", 154, 1998);
//ordenar coches 
        Arrays.sort(array);
        for(Cotxe c: array){
            System.out.println(c);
        }
    System.out.println("---------");
        //ordenar coches por medio de una clase   
        Arrays.sort(array, new CotxePerAnio());
        for (Cotxe c : array) {
            System.out.println(c);
        }

        System.out.println("---------");
        Arrays.sort(array, new CotxePerPreu());
        for (Cotxe c : array) {
            System.out.println(c);
        }
/**
 * new comparator es una instancia de una clase
 */
        Arrays.sort(array, new Comparator() {
            @Override
            public int compare(Object t, Object t1) {
                Cotxe c1 = (Cotxe) t;
                Cotxe c2 = (Cotxe) t1;
                return c1.getNombre().compareTo(c2.getNombre());
            }
        });

    }

}
