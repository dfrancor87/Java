/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generiques;

/**
 *
 * @author Danny Franco
 */
public class Prova {
    public static void main(String[] args) {
        Alumnes classe = new Alumnes();
        //Alumnes borrar;
        
        classe.afegir(new Alumne("Franco",1));
        classe.afegir(new Alumne("Alves",2));
        classe.afegir(new Alumne("Perez",1));
        
        //for each
        for(Object a:classe){
            Alumne a2= (Alumne)a;
            System.out.println(a2);
        }
        
        System.out.println("*************************");
        
        //eliminar        
        Alumne borrar = (new Alumne("Perez", 1));
        classe.eliminar(borrar);
        
             
    }
}
