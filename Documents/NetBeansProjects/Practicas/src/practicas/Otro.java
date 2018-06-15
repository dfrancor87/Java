/*

*funcion que dado un numero entero muestre sus divisores
3
lo mismo pero que ademas retorne
el numero de contadorDivisores que ha encontrado
==============================================
No muestra nada sino que retorna un String
con la lista de los contadorDivisores separado por comas
*****************
3
No muestra nada sino que retorna un 
vector con todos los contadorDivisores 
 
 */
package practicas;

/**
 *
 * @author Danfer
 */
import java.util.*;

public class Otro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrea un numero y te dire sus divisores");
        int num = entrada.nextInt();
        System.out.println("==========1=========");
        muestraDivisores(num);
        System.out.println("\n==========2=========");
        System.out.println("total de divisores");
        int totalDivisores = totalDivisores(num);
        System.out.println("hay "+totalDivisores);
        System.out.println("\n==========3=========");
        int[] vector = new int [totalDivisores(num)];
        vector= vectorDivisores(vector, num);
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
            
        }
    }

    public static void muestraDivisores(int num) {
        int divisor = num;
        while (divisor > 0) {
            if (num % divisor == 0) {
                System.out.print(divisor + ", ");
            }
            divisor--;
        }
    }
    public static int totalDivisores(int num){
        int divisor=num, total=0;
        while(divisor > 0){
            if (num%divisor==0){
                total++;
            }
            divisor--;
        }
        return total;
    }
    public static int[] vectorDivisores(int[]vector,int num){
        int divisor= num, i=0;
        while( divisor > 0 && i < vector.length){            
                if (num%divisor==0){
                    vector[i]=divisor;
                    i++;
                }
                divisor--;
        }
        return vector;
    }
    

}
