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
public class ProvaCoche {
    public static void main(String[] args) {
        
        //array de 5 coches
        Coche coches[] = new Coche [5];
        
        coches[0] = new Coche("Opel", 2300);
        coches[1] = new Coche ("Honda", 5000);
        coches[2] = new Coche ("Ferrari", 9000);
        coches[3] = new Coche ("Mercedes", 3000);
        coches[4] = new Coche ("Mazda", 1000);
        
        //para cambiar el valor de un atributo estatico llamamos a la clase
        Coche.cambiaIva(100);
       //nombre de la clase, variable, y nombre del array
        for(Coche c: coches){
            System.out.println(c);
        }
        
    }
    
}
