/*
Pedir al usuario numero naturales y calcule liego el valor medio
se acaba cuando introduce el 0 (Cero)
 */
package uf1;

import java.util.Scanner;

/**
 *
 * @author Danfer
 */
public class ValorMedioSeAcabaConCero {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor, media, sumaValor, valoresIngresados;
        sumaValor = 0;
        valoresIngresados = 0;
        do {
            System.out.println("(Para salir ingresa -1)");
            System.out.println("Ingresa un numero:");
            valor = entrada.nextInt();
            sumaValor += valor;//Suma los valeres uno tras otro
            valoresIngresados++;//Suma el numero de valores hemos ingresado
        } while (valor != -1);
        sumaValor += 1;//AGREGAMOS EL VALOR QUE HEMOS QUITADO AL SALIR
        valoresIngresados = valoresIngresados - 1; //RESTAMOS EL ULTIMO VALOR QUE ES EL -1 PARA QUE SOLO QUEDEN LOS VALORES INGRESADOS
        System.out.println(sumaValor);
        System.out.println(valoresIngresados);
        media = sumaValor / valoresIngresados;
        System.out.println("La media es: " + media);
    }
}
