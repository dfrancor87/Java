/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesAbstractas;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Danny Franco
 */
public class Empleado extends Persona {
    public static int countId = 1;
    
    private  int id ;
    private double sueldo;
    private Date altaContrato;
    

    public Empleado(String nom, double sue, int a, int m, int d) {
        // invocar constructor de la clase padre con su parametro corresponiente
        // a su constructor
        super(nom);
        
        this.id = countId;
        this.sueldo = sue;
        // usamos la clase GregorianCalendar para definir la fecha
        // m-1 xq los meses empiezan desde 0
        GregorianCalendar calendario = new GregorianCalendar(a, m - 1, d);
        // getTime para obtener la fecha
        this.altaContrato = calendario.getTime();        
        countId++;
        
    }
  
    // IMPORTANTE al heredar de Persona que es abstracta
    // estamos obligados a sobreescribir el metodo abstracto
    // agregar @Override
    @Override
    public String toString(){
        return "Este empleado tiene un id= "+id+" con un sueldo ="+sueldo;
    }
   

    public double dameSueldo() {
        return sueldo;
    }

    public Date dameAltaContrato() {
        return altaContrato;
    }

    // metodo para subir el sueldo
    public void subirSueldo(double porcentaje) {
        double aumento = this.sueldo * porcentaje / 100;
        this.sueldo += aumento;
    }

   //metodo estatico
    public static int obtenerId(){
        return countId;
    }

    
}
