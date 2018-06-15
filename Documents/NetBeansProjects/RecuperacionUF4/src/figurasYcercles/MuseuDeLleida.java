/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasYcercles;

/**
 *
 * @author Danny Franco
 */
public class MuseuDeLleida {

    public static void main(String[] args) {
        Quadre q1 = new Quadre(100, 100, "MonaLisa", "Leonardo Da Vinci");
        Quadre q2 = new Quadre(50, 50, "Las meninas");
        Escultura e1 = new Escultura(120, "La venus de milo");

        System.out.println(q1);
        System.out.println(q2);
        System.out.println(e1);
        System.out.println("Hay un total de "+ Obra.getNumObras());

    }

}
