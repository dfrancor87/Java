/*
Escriu una funció amb el següent prototip:
int xifres (int num, int xifra);
que retorni la quantitat de xifres iguals al paràmetre xifra que té el número passat per
paràmetre num. Exemple : 455 té 2 xifres igual a 5; 78 té 0 xifres iguals a 9;

Escriu una funció amb el següent prototip:
int sumarXifres(int v[10], int xifra);
que retorni la quantitat de vegades que apareix la xifra en el vector v. Has
d’utilitzar la funció xifres de l’exercici anterior
 */
package practicas;

/**
 *
 * @author Danfer
 */
import java.util.*;
public class pra2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingresa xifra");
        int xifra = entrada.nextInt();
        System.out.println("Ingresa num");
        int num = entrada.nextInt();
        int resul = xifres(xifra, num);
        System.out.println("se repite "+resul);
        System.out.println("======2======");
        int [] vector = {320, 1, 666, 111, 333};
        int suma = sumarXifres(vector, num);
        System.out.println("el total del vector es "+suma);
        
    }
    public static int xifres(int xifra, int num){
        int cont=0;
        while (xifra>0){
            int aux = xifra%10;
            xifra=xifra/10;
            if(aux==num){
                cont++;
            }
        }
        return cont;
        
    }
   public static int sumarXifres(int[]vector, int num){
       int total=0;
       for (int i = 0; i < vector.length; i++) {
           total = total + xifres(vector[i], num);
           
       }
       
       return total;
   }
}
