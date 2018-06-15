/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetoPersona;

/**
 *
 * @author HANHAN
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class PruebaPersona {
    
    public static void main(String[] args) {
        
        Persona[] persona = new Persona[1000];
        persona[0] = new Persona("blanco",true,"China");
        persona[1] = new Persona("azul",true,"España");
        persona[2] = new Persona("marrón",false,"Italia");
        persona[3] = new Persona("blanco",true,"España");
        
        System.out.println("nacionalidades: ");
        int i = 0;
        while(persona[i] != null){//mientras persona no sea NULO
            
            System.out.println(persona[i].getNacionalidad());
            i++;
 
        }
       
        System.out.println("\n fichero:");
        
        //ruta fichero
    
        String path = "ejemplo.txt";
        
        //escritura
        
        Fichero fichero = new Fichero();
        fichero.escribir(persona, path);//LLAMAS  A CLASE FICHERO
        
        
        //lectura        
        Object [] contenido = (Object[]) fichero.leer(path);        
        i = 0;
        while(contenido[i] != null){
            System.out.println(contenido[i]);
            i++;
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