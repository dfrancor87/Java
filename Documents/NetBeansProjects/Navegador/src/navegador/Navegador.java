package navegador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Danny Franco
 */
public class Navegador {

    //private String url;
    private Stack<String> atras = new Stack<String>();
    private Stack<String> adelante = new Stack<String>();
    private Collection<Historial> historial = new LinkedList();
    
    private Collection <Favoritos> favoritos = new LinkedList();
    

//    /**
//     * Metodo que nos devuelve la url actual
//     * 
//     *
//     * @return url
//     */
//    public String urlActual() {
//        return historial.get(historial.size() - 1);
//    }

    /**
     * Metodo que guarda en un arrayList las url ingresadas
     * y guarda en la pila atras
     */
    public void historial(String url) {
        Historial his = new Historial(url);
        historial.add(his);
      //  historial.add(url);
        atras.push(url);
    }

    /**
     * metodo que guarda en una pila la url actual
     */
    public void atras() {
        System.out.println(atras);
        if (atras.empty()) {
            System.out.println("No ha nada atras");
        } else {
            adelante.push(atras.pop());
         //   System.out.println(atras.peek());
        }
    }
    /**
     * Metodo que guarda en la pila atras     
     */
    public void adelante() {
        if (adelante.empty()) {
            System.out.println("No hay nada adelante");
        } else {
            atras.add(adelante.pop());
        //    System.out.println("ahora estas en: " + atras.peek());
        }
    }

    /**
     * metodo que guarda en un HashSet la url y el nombre recibe como parametro
     * la url y nombre que vamos a guardar
     *
     * @param url
     * @param nombreFavorito
     */
    public void favoritos(String url, String nombreFavorito) {
        Favoritos favo = new Favoritos(url, nombreFavorito);
        favoritos.add(favo);
    }

    /**
     * Metodo que muestra todos los favoritos que tenemos almacenados
     */
    public void muestraFavoritos() {
        for (Favoritos url : favoritos) {
            System.out.println(url);
        }
    }

    void elminar(String urlEliminar) {
        Favoritos borraFavo = new Favoritos(urlEliminar);        
        if(favoritos.contains(borraFavo)){
            System.out.println("si esta");
        }else{
            System.out.println("no esta");
        }
        ///favoritos.remove(urlEliminar);        
    }

    void muestraHistorial() {
        for (Historial url : historial) {
            System.out.println(url);
        }
    }

    
    
    

}
