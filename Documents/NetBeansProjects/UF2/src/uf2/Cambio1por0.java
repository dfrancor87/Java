/*
funcion en java que reciba un String con un numero
expresado en binario y retorne otro String pero 
sustituyendo todos los 1 por 0 y al contrario
0 por 1
 */
package uf2;

/**
 *
 * @author Danfer
 */
public class Cambio1por0 {
    public static void main(String[] args) {
        String numBi ="110011";
        String nuevoBi = cambia01(numBi);
        System.out.println(nuevoBi);
    }
    public static String cambia01(String num){
        String nuevoString="";
        for (int i = 0; i < num.length(); i++) {
            if(num.charAt(i)=='1'){
                nuevoString= nuevoString+'0';
            }else if (num.charAt(i)=='0'){
                nuevoString= nuevoString+'1';
            }           
        }
        return nuevoString;
    }
    
}
