/*
17. Una companyia de telèfon promociona les seves tarifes a 6 cèntims el minut trucant
a qualsevol operador. Fes un programa que, donada la quantitat de segons de
cada trucada calculi el seu cost en euros.
*/
package uf1;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class Ex17 {
  //  private static DecimalFormat df2 = new DecimalFormat(".##");

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuántos segundos ha consumido:   ");
        int seg = entrada.nextInt();
        // el minuto a 0.06
        int min=seg/60;
        double consumo=min*0.06;
  //      System.out.println("El consumo es de "+ df2.format(consumo)+" Euros");
        System.out.println("El consumo es de "+ String.format("%.2f", consumo)+" Euros");
    }
    
}
