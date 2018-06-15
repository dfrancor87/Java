/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2;

/**
 *
 * @author Danfer
 */
import java.util.*;

public class DecimalaBinario {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Pasar de decimal a Binario");
        int decimal = entrada.nextInt();
        decimalBinario(decimal);
        System.out.println("");
    }

    public static void decimalBinario(int decimal) {
      
        if (decimal<2){//caso base
            System.out.print(decimal);              
        }else{           
           decimalBinario(decimal/2);         
           System.out.print(decimal/2);
        }
          
        

    }

}
