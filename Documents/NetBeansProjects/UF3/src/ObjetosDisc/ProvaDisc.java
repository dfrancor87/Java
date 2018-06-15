/*
256.Fer una classe ProvaDisc per a provar la classe Disc que inicialitzi un vector amb un
conjunt de discs i permeti després guardar/recuperar en un fitxer tota la nostra
col·lecció.
 */
package ObjetosDisc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Danfer
 */
public class ProvaDisc {

    //guardar disco en un vector en la CLASE Disc
    public static void main(String[] args) {
        //declacar vector 
        Disc[] vectorDiscos = new Disc[5];

        vectorDiscos[0] = new Disc("Santo Pecado", "Ricardo Arjona", 2002, true);
        vectorDiscos[1] = new Disc("Esto es Estopa", "Estopa", 2014,true);
        vectorDiscos[2] = new Disc("Lo mejor del 2014", "Todos", 2014, false);
        
        //guardar el vector de discos en un fichero
        System.out.println("Vamos a guardar los datos del vector en un fichero");                  
        //escritura
        String ruta ="Discos10.txt";            
        ProvaDisc fichero = new ProvaDisc();//declaramos el objeto
        fichero.grabar(vectorDiscos, ruta);// ahora vector es un obejto
    
        System.out.println("Se ha guardado");
        
        
        //leer el vector objeto que hemos guardado      
        Object [] contenido = (Object[]) fichero.leer(ruta);
        int i=0;
        while(contenido[i] != null ){
            System.out.println(contenido[i]);
            i++;
        }
       
    }
    //funcion para leer el fichero guardado
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
    //funcion guardar    
     public void grabar(Object obj, String ruta){//FUNCION PARA ESCRIBIR RECIBE 2 PARAMETROS, EL OBJETO Y  LA RUTA        
        try{            
            FileOutputStream file = new FileOutputStream(ruta);
            ObjectOutputStream oos = new ObjectOutputStream(file);
            oos.writeObject(obj);
            oos.close();
            file.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }        
    }
     
}
