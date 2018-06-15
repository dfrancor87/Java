/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Danny Franco
 */
public class provaPersonatge {
    public static void main(String[] args) {
        //instanciar
        Personatge p=null, p2=null;
                //try
        try{
            p = new Personatge(20, "DAnny");
            p2 = new Personatge(-3, "Pep");
            
        }catch(EdatNegativaException | InventException e){
      //}catch(EdatNegativaException | InventException e){ agrupar dos excepciones 
            System.out.println("Error de edad");    
        }
        System.out.println(p);
    }
    
}
