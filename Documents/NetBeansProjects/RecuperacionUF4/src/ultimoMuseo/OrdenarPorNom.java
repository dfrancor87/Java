/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimoMuseo;

import java.util.Comparator;

/**
 *
 * @author Danny Franco
 */
public class OrdenarPorNom implements Comparable{

//    @Override
//    public int compare(Object t, Object t1) {
//      Quadre q1 = (Quadre)t;
//      Quadre q2 = (Quadre)t1;
//      
//      return Double.compare(q1.getCodi(), q2.getCodi());
//    }
    
     @Override
    public int compareTo(Object t){
        // hacemos un Casting del parametro recibido
        // 
        Quadre q = (Quadre) t;
        
        return q.getNom().compareTo(q.getNom());

   
    }
}
