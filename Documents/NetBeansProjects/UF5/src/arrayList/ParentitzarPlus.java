package arrayList;


import java.util.Stack;

/**
 *
 * @author Danny Franco
 */
public class ParentitzarPlus {
    public static void main(String[] args) {
        String cadena = "[(2+2)*(1+1)[B]]";
        Stack pila = new Stack();
        
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(' || cadena.charAt(i)== '['){
                pila.push(cadena.charAt(i));
                System.out.println(pila);
            }else if (cadena.charAt(i) == ')' || cadena.charAt(i)== ']'){
                pila.pop();
                System.out.println(pila);
            }            
        }
        if (pila.empty()){
            System.out.println("Esta correcto");
        }else{
            System.out.println("Falta de cerrar un ( ]");
        }
       
    }
}
