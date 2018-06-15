package basics;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Danny Franco
 */
public class ProvaPersonatge {

    public static void main(String[] args) {
        //  PersonaEjercicio1 p = new PersonaEjercicio1();

        PersonaEjercicio1 p = new PersonaEjercicio1(1, "Ana", "Buch", "Franc", 19, "12345");

        //Calendar calendario = new GregorianCalendar();
        //Calendar calendario = Calendar.getInstance();
        
        int hora, minutos, segundos;
        Calendar calendario = new GregorianCalendar();
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);

        // System.out.println(hora+""+ minutos+ ""+segundos);
    }

}
