package generiques;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Danny Franco
 */
public class Alumnes implements Iterable{
    private ArrayList<Alumne> alumnes = new ArrayList<>();
    

//    public Alumnes(ArrayList<Alumne> a) {
//        alumnes = a;
//    }
    
    public void afegir(Alumne a){
        alumnes.add(a);//agregar un alumno al arraylist
               
    }
    
      public void eliminar(Alumne a){
        alumnes.remove(a);//elimina un alumno al arraylist
               
    }
      
      public Iterator iterator(){
          Collections.sort(alumnes);//ordenar el arralist
          return alumnes.iterator();
      }     
      
      //iterar por curso
    
}
