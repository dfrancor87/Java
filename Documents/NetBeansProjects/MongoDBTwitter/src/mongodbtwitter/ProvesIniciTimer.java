package mongodbtwitter;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/** Exemple molt senzill de programar una tasca de manera
 *  periòdica. Aquest programa mostra prints "Hola que tal" 
 *  per consola cada 5 segons.
 *
 * @author montse
 * @version 20 abril 2017
 */
public class ProvesIniciTimer {
    public static void main(String[] args) {
        Date horaInici = new Date(System.currentTimeMillis());
        //24h=86400000;  
        //int repeticion =3600000; //1h 
        int repeticio = 60000 * 3; //cada 3 minuts
        repeticio=1000*5; //5 segons

        Timer temporizador = new Timer();
        temporizador.schedule(new TascaAFer(), horaInici, repeticio);
    }
}

class TascaAFer extends TimerTask {
    @Override
    public void run() {
        imprimirMissatges();
    }
    public void imprimirMissatges() {
        System.out.println("Hola que tal");
    }
}

