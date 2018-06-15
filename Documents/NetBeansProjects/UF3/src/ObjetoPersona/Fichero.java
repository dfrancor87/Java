/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetoPersona;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author HANHAN
 */
public class Fichero {
    
    public void escribir(Object obj, String path){//FUNCION PARA ESCRIBIR RECIBE 2 PARAMETROS, EL OBJETO Y  LA RUTA
        
        try{
            
            FileOutputStream file = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(file);
            oos.writeObject(obj);
            oos.close();
            file.close();

        }catch(Exception e){
            System.out.println(e.toString());
        }
        
    }
    
    public Object leer (String path){//FUNCION PARA LEER
        
        Object aux = null;
        
            try{
               FileInputStream file = new FileInputStream(path);
               ObjectInputStream ois = new ObjectInputStream(file);
               aux = ois.readObject();
               ois.close();
               file.close();
               
            }catch(Exception e){
                System.out.println(e.toString());
            }
        
        return aux;
        
    }
    

}
