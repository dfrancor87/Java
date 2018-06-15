/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioRadioHan;

import java.util.Iterator;

public class Radio{
    
    private Emissora [] emisoras = new Emissora[7];
    private int index = 0;
    
    public Radio() {
        
    }

    public Iterator creaIterator(String especialidad) {
                
        Iterator iterator;
        switch(especialidad){
            case "rock":
                iterator = new IteratorRock(emisoras);
                break;
            case "pop":
                iterator = new IteratorPop(emisoras);
                break;
            case "flamenco":
                iterator = new IteratorFlamenco(emisoras);
                break;
            default:
                iterator = new IteratorRock(emisoras);
             
        }
        
        return iterator;
        
    }
    
    public void afegirEmissora(Emissora emisora){
        emisoras[index++] = emisora;
    }
}
