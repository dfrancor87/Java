/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesAbstractasEjercicio;

/**
 *
 * @author Danny Franco
 */
public class Professor extends Empleat{
    
    private int credit;

    public Professor(int credit, String nom, String cognom, String dni, double sou, int horas) {
        super(nom, cognom, dni, sou, horas);
        this.credit = credit;
    }
    
    @Override
    public void incrementarSou() {
        double aumento = this.getSou() * 3 /100;
        
    }
    
    
}
