/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenUF4;

/**
 *
 * @author Danny Franco
 */
public class MuseuDeLleida {

    public static void main(String[] args) {

        Quadres q1 = new Quadres(20, 30, "Mona Lisa");
        Quadres q2 = new Quadres(20, 30, "Las meninas", "Leonardo Da vinci");
        Obra e1 = new Escultura (300, "La venus de milo");
        System.out.println(q1.toString());
        System.out.println(q2);
        System.out.println(e1);
        System.out.println("Hay "+Obra.getCont());
    }

}
