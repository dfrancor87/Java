/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparableComparator;

/**
 *
 * @author Danny Franco
 */
public class Coche implements Comparable{
    private double preu;
    private int any;
    private String nom;
    
    // prueba con id statico
    private int id;
    private static int countId=1;
    

    public Coche(String nom, double preu, int any) {
        this.preu = preu;
        this.any = any;
        this.nom = nom;
        this.id = countId;
        countId++;
    }

    public double getPreu() {
        return preu;
    }

    public int getAny() {
        return any;
    }

    public String getNom() {
        return nom;
    }

    public  int getId() {
        return id;
    }
    

    @Override
    public String toString() {
        return "Coche{" + "preu=" + preu + ", any=" + any + ", nom=" + nom + ", id=" + id + '}';
    }

    
    // compareTo para ordenar por nombre
    // recibe el objeto
    @Override
    public int compareTo(Object t){
        // hacemos un Casting del parametro recibido
        // 
        Coche c2 = (Coche) t;
        
        return nom.compareTo(c2.nom);
        // al comparar 2 objetos devuelve un entero (postivo, negativo o cero)
        // positivo si es mayor
        // negativo si es menor
        // cero si es igual
        
    }
            
}
