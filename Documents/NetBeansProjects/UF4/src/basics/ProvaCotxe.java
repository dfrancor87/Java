/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

/**
 *
 * @author Danny Franco
 */
public class ProvaCotxe {
     public static void main(String[] args) {
        Cotxe[] arrayCotxe = new Cotxe[5];
        arrayCotxe[0] = new Cotxe("Seat", 10000);
        arrayCotxe[1] = new Cotxe("Opel", 20000);
        arrayCotxe[2] = new Cotxe("Ferari", 100);
        arrayCotxe[3] = new Cotxe("Fiat", 50000);
        arrayCotxe[4] = new Cotxe("BMW", 6000);
        
        for (int i = 0; i < arrayCotxe.length; i++) {
            System.out.println(arrayCotxe[i]);
            
        }
        Cotxe.setIva(10);
        System.out.println("Preu amb iva 10%");
        for (int i = 0; i < arrayCotxe.length; i++) {
            System.out.println(arrayCotxe[i]);
            
        }
        

    }
    
}
