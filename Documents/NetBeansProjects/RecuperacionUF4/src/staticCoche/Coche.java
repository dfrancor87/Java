/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticCoche;

/**
 *
 * @author Danny Franco
 */
public class Coche {
    private String nom;
    private double preu;
    
    private int id;
    private static int countId=10000;
    private static int iva=21;
    
    public Coche (String nom, double preu){
        this.id = this.countId;
        this.nom = nom;
        this.preu = preu;
        this.countId++;
        
    }

    // para obtener o cambiar un atributo estatio
    // su metodo tambien tiene que ser estatico Setter/Getter
    public static void cambiaIva(int ivaNuevo){
      iva = ivaNuevo;
    }
    
    public double calcularPrecio(){
        return preu + preu * iva /100;
    }
    
    // para mostrar los 2 precios modificamos el toString
    @Override
    public String toString() {
        return "id: "+id + " nom: " + nom + ", preu: " + preu + ", precio con iva: "+calcularPrecio();
    }
    
}
