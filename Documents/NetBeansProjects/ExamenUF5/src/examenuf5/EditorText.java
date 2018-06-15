package examenuf5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Danny Franco
 */
public class EditorText /*implements Iterable*/{

    private String texto;
    private Stack<String> pila1 = new Stack<String>();
    private Stack<String> pila2 = new Stack<String>();
    private Stack<String> pilaTotal = new Stack<String>();
    //correccion
    private LinkedList<String> llista; //para guardar las palabras introducidas

    //agregar la pila?
//    public EditorText(String txt){
//        texto = txt;        
//    }
    public void afegirLiniaAlFinal(String linea) {
        pilaTotal.push(linea);
        pila1.push(linea);
    }

    public void desferAfegir() {

        if (pila1.empty()) {
            System.out.println("No se puede");
        } else {
            pila2.push(pila1.pop());

        }
    }

    public void referAfegir() {
        if (pila2.empty()) {
            System.out.println("No se puede");
        } else {
            pila1.push(pila2.pop());
         //   System.out.println("control z tiene " + pila1);
        }
    }

    public void print() {
        System.out.println("total" + pilaTotal);

    }


}
