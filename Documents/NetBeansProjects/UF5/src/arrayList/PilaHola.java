package arrayList;

import java.util.Stack;

/**
 *
 * @author Danny Franco
 */
public class PilaHola {

    public static void main(String[] args) {
        Stack<Character> pila = new Stack<Character>();
        pila.push('h');
        pila.push('o');
        pila.push('l');
        pila.push('a');
        
        //mostrar pila con for each
        for(Character p: pila){
            System.out.println(p);
        }
        System.out.println("*************");
        //mostrar pila  con for
        for (int i = 3; i >= 0; i--) {
            System.out.println(pila.get(i));
        }
        
        //mostrarla invertida
//        System.out.println("********************");
//        for (int i = 0; i < pila.size(); i++) {
//            System.out.println(pila.get(i));
            
 //       }

        //crear pila 2 para invertirla
        
        //crear nueva pila
        Stack<Character> pilaInvertida = new Stack<Character>();
        while (!pila.empty()) {
            pilaInvertida.push(pila.pop());
        }
        // print pila invertida
        /*
        System.out.println("**************");
        for (int i = 3; i >= 0; i--) {
            System.out.println(pilaInvertida.get(i));
        }*/
        
        
    }

}
