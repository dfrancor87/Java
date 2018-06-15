package basics;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Danny Franco
 */
public class Hora {

    private int hora;
    private int min;
    private int seg;

//constructor
    public Hora(int h, int minutos, int segundos) {
        hora = h;
        min = minutos;
        seg = segundos;
    }

//constructor hora sistema
    public Hora() {
        Calendar horaSistema = new GregorianCalendar();
        hora = horaSistema.get(Calendar.HOUR_OF_DAY);
        min = horaSistema.get(Calendar.MINUTE);
        seg = horaSistema.get(Calendar.SECOND);
    }

    //metodos
    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSeg(int seg) {
        this.seg = seg;
    }

    public Hora sumar(Hora h) {

        Hora auxHora;
        int total = pasarASegundos();
        int seg = pasarASegundos();
        //Hora aux = new Hora (seg, h.getSeg());
        //int seg = h.pasarASeg();
        //int local = this.pasarASeg();
        //int local = pasarASeg();
        //Hora aux = new Hora(h,m,s);
        return this;

    }
    public Hora resta (Hora h2){
        Hora  auxHora;
        int total = 0;
        return null;
        
        
    }
    public int pasarASegundos() {
        int segundos = hora * 3600 + min * 60 + seg;
        return segundos;
    }

    @Override
    public String toString() {
        return hora + ":" + min + ":"+seg;
    }
    
    
}
