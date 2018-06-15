/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimoMuseo;

import java.util.Arrays;

/**
 *
 * @author Danny Franco
 */
public class MuseuDeLleida {

    public static void main(String[] args) {
        Quadre array[] = new Quadre[3];
//        Quadre q1 = new Quadre(200, 200, "El grito");
//        Quadre q2 = new Quadre(100, 100, "Mona lisa", "Picasso");
//        Quadre q3 = new Quadre(100, 100, "Alucinar", "Picasso");
        array[0] = new Quadre(200, 200, "El grito");
        array[1] = new Quadre(100, 100, "Mona lisa", "Picasso");
        array[2] = new Quadre(100, 100, "Alucinar", "Amancio");
        
   //     Escultura e1 = new Escultura(300, "La venus de milo");
//        System.out.println(q1.toString());
//        System.out.println(q2.toString());
    //    System.out.println(e1.toString());
        
        //ORDENAR ESCULTURAS POR NOMBRE
        Arrays.sort(array);
        for(Obra a: array){
            System.out.println(a);
        }
        
        
        System.out.println("Total de obras " + Obra.getContadorObras());

    }

}
