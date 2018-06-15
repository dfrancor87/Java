/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;
import java.util.*;
/**
 *
 * @author Danfer
 */
public class pisoProva {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        piso [] vector =new piso[2];
         for (int i=0;i<vector.length;i++){
            vector[i] =new piso();
        
         }
         for (int i = 0; i < 2; i++) {
             System.out.println(vector[i]);
            
        }
     
    }
    
}
