/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenUF4Processing;

import java.util.Comparator;

/**
 *
 * @author Danny Franco
 */
public class OrdenarPorRadio implements Comparator {
    // este metodo devuelve un 1, -1 o 0 al hacer la comparacion
    @Override
    public int compare(Object t1, Object t2) {
        Cercle c1 = (Cercle)t1;
        Cercle c2 = (Cercle)t2;
        return Double.compare(c1.getRadi(), c2.getRadi());
       
    }

    
    
}
