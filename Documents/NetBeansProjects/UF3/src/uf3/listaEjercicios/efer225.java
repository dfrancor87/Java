/*
225. Sabem que un fitxer de text conté noms de persones i telèfons de la següent
manera: Cognom1 Cognom2 Nom Telefòn

López Solís Montse 677123123
Garcia Pérez Joan 689765456
Sala Garcés Pep 655345123

Creeu un nou fitxer de text que es dirà “telefons.txt” que escriurà les dades de
la forma
“Nom:” Nom Cognom1 Cognom2 “Telf:” telèfon <salt de línia>
En l’exemple sortiria:

Nom: Montse López Solís Telf: 677123123
Nom: Joan Garcia Pérez Telf: 689765456

 */
package uf3.listaEjercicios;
import java.io.*;
import java.util.*;
public class efer225 {
    public static void main(String[] args) {
        try{
            //read
            FileReader fr = new FileReader ("D:\\ficheros\\225.txt");
            Scanner sc = new Scanner (fr);
            
            while(sc.hasNext()){
               //String linea = sc.nextLine();
               //usar el delimitador
                String ap1= sc.next();
                String ap2 = sc.next();
                String nom = sc.next();
                String telefono = sc.next();
                System.out.println(ap1);
                System.out.println(ap2);
                System.out.println(nom);
                System.out.println(telefono);
                
                //write
                FileWriter fichero = new FileWriter ("D:\\ficheros\\telefonos.txt");
                PrintWriter pw = new PrintWriter (fichero);
                pw.print("nom: "+ nom +" "+ ap1 + " " + ap2 + " "+ "Telef: "+ telefono);
                fichero.close();
                pw.close();
                
                
            }
            fr.close();
            sc.close();
            
        }
        catch(Exception e){
            System.out.println(e.toString() );
        }
        
    }
    
}
