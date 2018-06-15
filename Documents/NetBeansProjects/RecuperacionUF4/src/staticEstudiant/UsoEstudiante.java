/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticEstudiant;

/**
 *
 * @author Danny Franco
 */
public class UsoEstudiante {

    public static void main(String[] args) {
        Estudiante estu[] = new Estudiante[2];

        estu[0] = new Estudiante("DAnny", "Franco", 8);
        estu[1] = new Estudiante("Pepe", "Fernandez", 10);

        //nombre de la clase, variable, y nombre del array
        //cambiar a mayuscula
        for (Estudiante e : estu) {
            e.setNombre();
            e.setApellido();
            System.out.println(e);
        }
        System.out.println("************");
        
        // cambiar nombre del insti
        //IMPORTANTE para acceder a un metodo static
        // se accede desde la clase, no desde el objeto
        Estudiante.setNomInsti();
        for (Estudiante e : estu) {          
            System.out.println(e);
        }
    }
}
