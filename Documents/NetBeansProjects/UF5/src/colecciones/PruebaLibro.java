/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author Danny Franco
 */
public class PruebaLibro {

    public static void main(String[] args) {
        Libro libro1 = new Libro("Programacion en Java", "Juan", 25);
        Libro libro2 = new Libro("Programacion en Java", "Juan", 26);

        if (libro1.equals(libro2)) {
            System.out.println("Es el mimo");
        } else {
            System.out.println("NO es el mismo");
        }
    }

}
