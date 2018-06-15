/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargarConstructores;

/**
 *
 * @author Danny Franco
 */
public class PruebaEmpleado {

    public static void main(String[] args) {
        
        Empleado misEmpleados[]= new Empleado[4];
        
        misEmpleados[0]= new Empleado("Danny", 650, 2017, 11, 28);
        misEmpleados[1]= new Empleado("Pepe", 1000, 2018, 06, 06);
        misEmpleados[2]= new Empleado("Juan", 150, 2018, 06, 06);
        misEmpleados[3]=new Empleado("Juan");
       

        for (Empleado empleado: misEmpleados) {
            System.out.println(empleado);
            
        }
        
         
        
    }

}
