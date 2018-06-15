/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

/**
 *
 * @author Danfer
 */
public class frecuencia {
    public static void main(String[] args) {
        int []vector=new int[10];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*5)+1;
            System.out.print(vector[i]+" ");

        }
        int masrepite=0, veces=0, elquemas=0;
        for (int i = 0; i < vector.length; i++) {
            masrepite=1;
            for (int j = i+1; j < vector.length; j++) {
                if(vector[i]==vector[j]){
                    masrepite++;
                }
                
            }
            if(masrepite>veces){
                veces=masrepite;
                elquemas=vector[i];
            }
            
           
        }
         System.out.println("\nel que mas se repite "+elquemas+" numero de veces "+veces);
    }
    
}
