package objetos;

import java.util.*;

public class pruebaFecha {

    public static void main(String[] args) {
        //VECTOR FECHA
        fecha[] vectorFecha = new fecha[5];
        //CONSTRUCTOR CON PARAMETROS FECHA
        
        vectorFecha[0] = new fecha(13, 7, 1987);
        vectorFecha[1] = new fecha(25, 1, 1987);

        //MOSTRAR TODAS LAS FECHAS
        for (int i = 0; i < vectorFecha.length && vectorFecha[i] != null; i++) {
            System.out.println(vectorFecha[i]);

        }

    }
}
