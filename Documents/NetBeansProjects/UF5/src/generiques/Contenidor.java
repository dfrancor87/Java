/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generiques;

import java.util.ArrayList;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

/**
 *
 * @author Danny Franco
 */
public class Contenidor<E> { 
    private ArrayList<E> elements = new ArrayList();
    
    public boolean cercar (E element){
       return elements.contains(element);
    }
    
    public void afegir (E element){
        elements.add(element);
    }
    
}
