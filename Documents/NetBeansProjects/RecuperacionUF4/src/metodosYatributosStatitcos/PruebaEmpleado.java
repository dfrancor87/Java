/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosYatributosStatitcos;

/**
 *
 * @author Danny Franco
 */
public class PruebaEmpleado {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Danny", 650, 2017, 11, 28);
        Empleado empleado2 = new Empleado("Pepe", 1000, 2018, 06, 06);
        Empleado empleado3 = new Empleado("Juan", 150, 2018, 06, 06);
        //System.out.println(empleado1);

        empleado1.subirSueldo(50);
//        System.out.println(empleado1);
//        System.out.println(empleado2);
        System.out.println("ID: "+empleado1.getId()+" Nombre: " + empleado1.getNombre() + " Sueldo: " + empleado1.getSueldo() + " Fecha de alta " + empleado1.getAltaContrato());
        System.out.println("ID: "+empleado2.getId()+" Nombre: " + empleado2.getNombre() + " Sueldo: " + empleado2.getSueldo() + " Fecha de alta " + empleado2.getAltaContrato());
         System.out.println("ID: "+empleado3.getId()+" Nombre: " + empleado3.getNombre() + " Sueldo: " + empleado3.getSueldo() + " Fecha de alta " + empleado3.getAltaContrato());
         
         System.out.println(Empleado.obtenerId());
         System.out.println(Math.PI);
    }

}
