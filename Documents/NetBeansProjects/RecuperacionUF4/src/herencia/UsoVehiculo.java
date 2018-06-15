/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Danny Franco
 */
public class UsoVehiculo {
    public static void main(String[] args) {
        Coche coche1 = new Coche();        
        coche1.editaColor("Rojo");
        
        Furgoneta furgoneta1  = new Furgoneta(7, 580);
        // metodos de la clase COCHE
        furgoneta1.editaColor("Azul");
        furgoneta1.configuraAsientos("si");
        furgoneta1.configuraClimatizador("si");
        
        System.out.println(coche1.datos()+" "+coche1.dimeColor());
        System.out.println(furgoneta1.datos()+" "+furgoneta1.dimeDatosFurgoneta()+" "+furgoneta1.dimeColor());
    }
    
}
