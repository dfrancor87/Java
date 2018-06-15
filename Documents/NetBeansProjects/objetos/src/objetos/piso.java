/*
clase para guardar informacion de un piso
 */
package objetos;

import java.util.*;

/**
 *
 * @author Danfer
 */
public class piso {

    //atributos del piso
    private String zona;
    private int metrosCuadrados;
    private int habitaciones;
    private int baños;
    private boolean ascensor;
    private int precio;

    /*CONSTRUCTOR DE LA CLASE */

    public piso(String zona, int metrosCuadrados, int habitaciones, int baños, boolean ascensor, int precio) {
        this.zona = zona;
        this.metrosCuadrados = metrosCuadrados;
        this.habitaciones = habitaciones;
        this.baños = baños;
        this.ascensor = ascensor;
        this.precio = precio;
    }


    /* INGRESAR INFO DEL PISO*/
    
    
    public piso() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Zona?");
        zona=entrada.next();
        System.out.println("¿Cuántos metros cuadrados tiene el piso:?");
        metrosCuadrados = entrada.nextInt();
        System.out.println("¿Cuántas habitaciones tiene?");
        habitaciones = entrada.nextInt();
        System.out.println("¿Cuántos baños tiene?");
        baños = entrada.nextInt();
        System.out.println("¿El piso tiene ascensor? (S/N)");
        char respo = entrada.next().toUpperCase().charAt(0);
        if (respo == 'S') {
            ascensor = true;
        } else {
            ascensor = false;
        }
        System.out.println("¿Precio?");
        precio = entrada.nextInt();

        //Para generar las consultas
    }

    

    //to string

    @Override
    public String toString() {
        return "piso{" + "zona=" + zona + ", metrosCuadrados=" + metrosCuadrados + ", habitaciones=" + habitaciones + ", ba\u00f1os=" + baños + ", ascensor=" + ascensor + ", precio=" + precio + '}';
    }

    

    
}
