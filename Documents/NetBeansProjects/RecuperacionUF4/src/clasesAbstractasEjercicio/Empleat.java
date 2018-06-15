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
public abstract class  Empleat {
    
    private String nom;
    private String cognom;
    private String dni;
    private double sou;
    private int horas;

    public Empleat(String nom, String cognom, String dni, double sou, int horas) {
        this.nom = nom;
        this.cognom = cognom;
        this.dni = dni;
        this.sou = sou;
        this.horas = horas;
    }
    
    public abstract void incrementarSou();

    
    public double getSou() {
        return sou;
    }

    @Override
    public String toString() {
        return "Empleat{" + "nom=" + nom + ", cognom=" + cognom + ", dni=" + dni + ", sou=" + sou + ", horas=" + horas + '}';
    }

    
    

    
}
