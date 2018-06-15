/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Arrays;

/**
 *
 * @author Danny Franco
 */
public class PruebaEmpleado {

    public static void main(String[] args) {

        Empleado misEmpleados[] = new Empleado[6];
        Jefe jefeRRHH = new Jefe("Juan", 55000, 2006, 9, 25);
        jefeRRHH.estableceIncentivo(2570);

        misEmpleados[0] = new Empleado("Ana", 30000, 2000, 7, 7);
        misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 06, 15);
        misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
        misEmpleados[3] = new Empleado("Antonio");
        misEmpleados[4] = jefeRRHH;
        misEmpleados[5] = new Jefe("María", 95000, 1999, 5, 26);

        // CASTING DE OBJETOS
        // UN JEFE ES UN EMPLEADO PERO 
        // NO TODOS LOS EMPLEADOS SON JEFES
        Jefe jefe_finanzas = (Jefe) misEmpleados[5];
        jefe_finanzas.estableceIncentivo(55000);
        
    
        
        for (Empleado empleado : misEmpleados) {
           empleado.subirSueldo(5);
        }
        
        for (Empleado empleado : misEmpleados) {
            System.out.println("Nombre: "+empleado.dameNombre()+" Sueldo:"+empleado.dameSueldo()+" Fecha de alta: "+empleado.dameAltaContrato());

        }
        
        
        

    }

}
