/*
Dado un numero entero, hacer una función para calcular
la raíz cuadrada.
public static int arrel (int numero)


raiz 25 = 5
raiz 24 = 4
raiz 15 = 3
raiz 16 = 4

1*1=1
2*2=4
3*3=9
4*4=16

SI ingreso 15 
la raiz es 3

xq raiz > 15
 */
package uf2;

/**
 *
 * @author Danfer
 */
import java.util.*;

public class RaizCuadrada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa que calcula la raiz");
        System.out.print("Ingresa un número: ");
        int num = entrada.nextInt();
        int resul = raiz(num);
        System.out.println(resul);
    }

    public static int raiz(int num) {
        int cont = 1, raiz = 1;
        while (raiz < num) {
            cont++;
            raiz = cont * cont;

        }
        if (raiz == num) {
            return cont;
        } else {
            return cont-1;
        }        
    }
    public static int raiz2(int num){
        int contImpar=1;
        int raizCont=1;
        int impar=1;
        while (raizCont < num){
            impar++;
            contImpar+=2;
            raizCont = raizCont+impar;
        }
        return impar;
    }
}
