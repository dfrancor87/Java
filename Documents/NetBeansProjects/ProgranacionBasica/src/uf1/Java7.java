/*
Una persona pot viure 100 anys si no fuma (fuma = false), menja sa (menja_Sa =true), 
i fa exercici (exercici = true). Planteja en funció d’aquests tres paràmetres una
expressió que ens digui si viurem o no 100 anys.
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author prof
 */
public class Java7 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa pra determinar si vivirás 100 años");
        boolean fuma, menjaSa, exercici;
        System.out.print("Fumas ? (Si/No) ");
        String siNo = entrada.next().toLowerCase();//SOLO UN STRING.. ASI SEAN 10 VARIABLES SINO
        if (siNo.equals("si")) {
            fuma = true;
        }
        else {
            fuma = false;
        }
        System.out.print("Menges sa ? (Si/No) ");
        siNo = entrada.next().toLowerCase();
        if (siNo.equals("si")) {
            menjaSa = true;
        }
        else {
            menjaSa = false;
        }  
        System.out.print("Fas exercici moderat ? (Si/No) ");
        siNo = entrada.next().toLowerCase();
        if (siNo.equals("si")) {
            exercici = true;
        }
        else {
            exercici = false;
        }  
            
        if (!fuma && menjaSa && exercici) {
            System.out.println("Pots viure 100 anys");
        }
        else {
            System.out.println("Has de canviar aquests costums...");
        }
    }
}
