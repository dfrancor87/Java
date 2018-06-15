/*
funcion que reciba un numero N y calcule su cubo
1 al 3 = 1
2 al 3 = 3 + 5 =8
3 al 3 = 7 + 9 + 11=27
4 al 3 = 13 + 15 + 17 + 19 = 64 
 */

 package uf2;

/**
 *
 * @author Danny Franco
 */
import java.util.Scanner;

public class FuncionAlCubo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Programa que calcula el cubo de un entero");
        System.out.println("Ingresa un numero y te dire su equivalente al cubo");
        int num = entrada.nextInt();
        System.out.print(num + " al cubo es: ");
        cubo(num);
    }

    public static void cubo(int num) {
        //base positiva
        int suma, resultado = 0;
        if (num > 0) {
            suma = (num * (num - 1)) + 1;
            for (int i = 0; i < num; i++) {
                resultado = resultado + suma;
                suma += 2;
            }
            //base negativa
        } else {
            suma = (num * (-num - 1) - 1);
            int cont = 0;
            while (cont > num) {
                resultado = suma + (resultado);
                suma -= 2;
                cont--;
            }

        }

        System.out.println(resultado);

    }

}
