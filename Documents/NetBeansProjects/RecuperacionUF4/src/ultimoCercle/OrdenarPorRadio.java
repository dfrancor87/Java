/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimoCercle;

import java.util.Comparator;

/**
 *
 * @author Danny Franco
 */
public class OrdenarPorRadio implements Comparator{

    @Override
    public int compare(Object t, Object t1) {
        Cercle c1 = (Cercle)t;
        Cercle c2 = (Cercle)t1;
        return Double.compare(c1.getRadi(), c2.getRadi());
     
    }
    
}
