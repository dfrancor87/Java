/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf2;

/**
 *
 * @author Danny Franco
 */
import java.util.*;

public class ExamenDannyFranco {

    public static void main(String[] args) {

        
        System.out.println("========1========");
        int num1 = -25, num2 = 40;
        boolean resultado = pregunta1(num1, num2);
        System.out.println(num1+", "+num2);
        System.out.println("El resultado es: " + resultado);

        
        
        System.out.println("========2========");
        String[] vector = {"LA SAGRERA", "ONZE DE SETEMBRE", "BON PASTOR", "LLEFIA", "LA SALUT", "GORG"};
        String origen = "gorg".toUpperCase();
        String destino = "gorg".toUpperCase();
        int numEstaciones = pregunta2(vector, origen, destino);
        System.out.println("");
        System.out.println("REsultado: " + numEstaciones);

        
        
        
        System.out.println("\n========3========");
        String decimal = "112233";
        String decimalResul = pregunta3(decimal);
        System.out.println(decimalResul);
        
                
                
                
        System.out.println("========4========");
        int[] array = {2, 4, 6, 8, 10,3};
        int divisible = 3;
        //funcion para calcular dimension
        int[] arrayResul = pregunta4(array, divisible);
        for (int i = 0; i < arrayResul.length; i++) {
            System.out.print(arrayResul[i] + "  ");

        }

    }

    
    
    
    
    
    //1
    public static boolean pregunta1(int num1, int num2) {
        //pasar a valor absoluto
        if(num1<0){
            num1*=-1;            
        }
        if (num2<0){
            num2*=-1;
            
        }
        if ((num1*2 <= num2) || (num2*2<=num1)){
            return true;
        }else{
            return false;
        }
    }

    //2
    public static int pregunta2(String[] vector, String origen, String destino) {
        //si las estaciones son iguales
        if (origen.equals(destino)) {
            System.out.println("Estaciones iguales");
            return 0;
        }

        return 1;

    }
    //3
    public static String pregunta3(String decimal){
        //guardar estring en vector
        String sinRepe="";
        char [] vector = new char [decimal.length()];
     
        for (int i = 0; i < vector.length; i++) {           
                vector[i]=decimal.charAt(i);                                                   
            }
        char [] vector2 = vector;
        for (int i = 0; i < vector.length; i++) {
                   if (vector[i]!=' '){
                    sinRepe+=vector2[i];
                   }
            
            
        
            
        }
        
        return sinRepe;
    }
    
    

    //4
    public static int[] pregunta4(int[] array, int divisible) {
        //calcula dimension de vector a devolver
        int dimension = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % divisible == 0) {
                dimension++;
            }
        }
        if (dimension > 0) {
            int[] arrayDivisibles = new int[dimension];
            int z = 0; //index de arrayDivisibles
            for (int i = 0; i < array.length; i++) {
                if (array[i] % divisible == 0) {
                    arrayDivisibles[z] = array[i];
                    z++;
                    //System.out.print(arrayDivisibles[i] + "  ");
                }

            }
            return arrayDivisibles;
        } else {

            return null;
        }

    }

}
