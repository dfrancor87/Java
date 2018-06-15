/*
Escriu una funció que rebi dos enters i esbrini si els dos números contenen les
mateixes xifres, encara que siguin en ordre diferent:
boolean xifresIguals(int num1, int num2);
La funció retorna true si els dos números contenen les mateixes xifres, false altrament.
Exemples:
xifresIguals(1234,4312) retorna true
xifresIguals(16133546,66543113) retorna true
xifresIguals(123,1234) retorna false
xifresIguals(123,456) retorna false
 */
package practicas;

/**
 *
 * @author Danfer
 */
import java.util.*;

public class Practicas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa cifra");
        String xifra = entrada.next();
        System.out.println("ingresa num");
        int num = entrada.nextInt();
        boolean resultado = compara(xifra, num);
        System.out.println(resultado);
    }

    public static boolean compara(String xifra, int num) {
       
        int n,i=0;
        while (i<xifra.length()){
            n=xifra.charAt(i)-48;
            if(n < num){
                i++;
            }else{
                return false;
            }
        }
        return true;
      
    }

}
