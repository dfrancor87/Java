package arrayList;

import java.util.Stack;

/**
 *
 * @author Danny Franco
 */
public class Parentitzar {

    public static void main(String[] args) {
        String cadena = "(((1 + 2)+(2+2)))";
        Stack pila = new Stack();
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(' ) {
                pila.push(cadena.charAt(i));
                System.out.println(pila);
            }else if (cadena.charAt(i) == ')'){
                //eliminar último elemento 
                pila.pop();
                System.out.println(pila);
            }
        }        
        //comprobar si la pila esta vacía
        if (pila.empty()){
            System.out.println("Los parentesis son correctos");
            System.out.println(pila);
        }else{
            System.out.println("Faltan parentesis");
            System.out.println(pila);
        }            
    }
}
