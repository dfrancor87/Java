/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorSucursal;

import java.util.Iterator;

/**
 *
 * @author Danny Franco
 */
public class SucursalIterator implements Iterator{
   private Empleado[]  empleado;
   private int index = 0;
   
   public SucursalIterator(Empleado[] e){
       empleado = e;
   }
  
   public Empleado next(){
       return empleado[index++];
   }
   
   public boolean hasNext(){
       if(index < empleado.length && empleado[index] != null){
           return true;           
       }else{
           return false;
       }
   }
   
//  public void remove(){
//      
//  }
    
}
