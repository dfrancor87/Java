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
public class PAS extends Empleat {
    
    private String turno;

    public PAS(String turno, String nom, String cognom, String dni, double sou, int horas) {
        super(nom, cognom, dni, sou, horas);
        this.turno = turno;
    }
    
    @Override
    public void incrementarSou() {
        double aumento = this.getSou() * 3 /100;
        
    }
    
}
