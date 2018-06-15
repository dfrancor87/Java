/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Danny Franco
 */

/*
Regla es un
¿Un Jefe es un Empleado? (Siempre)
¿Un Empleado es un Jefe?
 */
public class Jefe extends Empleado implements Jefes{

    private double incentivo;

    public Jefe(String nombre, double sue, int anio, int mes, int dia) {
        super(nombre, sue, anio, mes, dia);
    }

    public void estableceIncentivo(double b) {
        this.incentivo = b;
    }

    @Override
    public double dameSueldo() {
        // super.dameSueldo(); llama a dameSueldo de Empleado
        double sueldoJefe = super.dameSueldo();

        return sueldoJefe + this.incentivo;
    }

    @Override
    public String tomarDeciciones(String decision) {
        return "Ha tomado la decisión de: "+decision;
    }
}
