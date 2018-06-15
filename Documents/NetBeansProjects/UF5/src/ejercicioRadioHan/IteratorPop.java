/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioRadioHan;

import java.util.Iterator;

/**
 *
 * @author HANHAN
 */
public class IteratorPop implements Iterator {
    
    private int indice = 0;
    Emissora [] emissoras; 

    public IteratorPop(Emissora[] emisora) {
        this.emissoras = emisora; 
    }
    
    @Override
    public boolean hasNext() {

        boolean e = false;
        //iniciar i con indice, que es cambiado en el método next
        for(int i = indice; i  < emissoras.length && !e; i++){
            if(emissoras[i].getEspecialidad().equals("pop")){
                // encontrado un objeto del tipo pop, salgo del bucle
                e = true;
                this.indice = i;
            }
        }
        return e;
    }

    /**
     *  Mientras que el objeto no es del tipo pop, sigue avanzando hasta encontrar uno que se pop
     * @return 
     */
    @Override
    public Object next() {
        // aumentar en uno en la siguiente llamada de la variable
        Emissora e = emissoras[this.indice++];
        return e;
    }
    
}
