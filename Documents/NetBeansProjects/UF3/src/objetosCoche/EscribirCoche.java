/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosCoche;

/**
 *
 * @author Danfer
 */
import java.util.*;
import java.io.*;

public class EscribirCoche {

    public static void main(String[] args) {
        //primero hacer las funciones
        Coche mio = new Coche ("B-0514SK","Blanco","opel", "astra", 50.99, 5);
        grabarCoche(mio);
    }

    //espera una respoues si o no del usuario
    public static boolean siNo(String pregunta) {
        Scanner entrada = new Scanner(System.in);
        char car;
        do {
            System.out.println(pregunta + " S/N ?");
            car = entrada.next().toUpperCase().charAt(0);
            if (car != 'N' && car != 'S') {
                System.out.println("Se esperaba una respuesta S/N");
            }
        } while (car != 'N' && car != 'S');
        return car == 'S';
    }
    //GUARDAR UN COCHE EN EL FICHERO INDICADO
    
    public static void grabarCoche (Coche c){
        Scanner entrada = new Scanner (System.in);
        System.out.println("NOMbre del fichero a grabar? ");
        String nomFichero = entrada.next();
        File in = new File(nomFichero);
        if (in.exists() ){
            System.out.println("El ficheri ya exite ");
            if (siNo ("quieres sobreescribirlo")){
                in.delete();                
            }else{
                System.out.println("No se ha grabado");
                return ;
            }
                
        }
        try {
            FileOutputStream fo = new FileOutputStream(nomFichero, false);
            ObjectOutputStream obo = new ObjectOutputStream(fo);
            //mostarar el coche guardado
            System.out.println(c);
            
            obo.writeObject(c);
            obo.close();
            fo.close();
        } catch (IOException e) {
			System.out.println("Problemes d'E/S");
			System.out.println(e);
		}
    }
}

