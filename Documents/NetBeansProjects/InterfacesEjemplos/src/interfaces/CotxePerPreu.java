/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Comparator;

/**
 *
 * @author Danny Franco
 */
public class CotxePerPreu implements Comparator {
    
    
    @Override
    public int compare(Object t, Object t1) {
        Cotxe c1 =(Cotxe)t;
        Cotxe c2=(Cotxe)t1;
        return Double.compare(c1.getPrecio(), c2.getPrecio());
    }
    
}
