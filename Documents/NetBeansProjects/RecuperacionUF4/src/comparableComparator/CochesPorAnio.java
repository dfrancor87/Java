/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparableComparator;

import java.util.Comparator;

/**
 *
 * @author Danny Franco
 */
public class CochesPorAnio implements Comparator {
    
    @Override
    public int compare(Object t1, Object t2){
        Coche c1 = (Coche)t1;
        Coche c2 = (Coche)t2;
        return Double.compare(c1.getAny(), c2.getAny());
    }
    
}
