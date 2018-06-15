/*
funcion que reciba un String y retorni la diferencias
"101101"
4-2=2
 */
package uf2;

/**
 *
 * @author Danfer
 */
public class Cuenta10 {
    public static void main(String[] args) {
        System.out.println("Cuenta 1  y 0");
        String numero = "101101";
        int resul = diferencia(numero);
        System.out.println(resul);
        
    }
    public static int diferencia(String num){
        int cont=0;
        for(int i=0; i < num.length();i++){
            if (num.charAt(i)=='1'){
                cont= cont+1;
            }else if(num.charAt(i)=='0'){
                cont= cont-1;
            }
        }
        return cont;
    }
}
