
package poo;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


/**
 *
 * @author Danny Franco
 */
public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private Date fechaNaci;
    private int edad;
    private String clave;
   

    public Persona(int id, String nombre, String apellido, String clave, int anio, int mes, int dia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.clave = clave;
        
        GregorianCalendar fecha = new GregorianCalendar(anio, mes-1, dia);
        this.fechaNaci = fecha.getTime();
    }

    public int getEdad() {
        return edad;
    }


    public int getId() {
        return id;
    }
    
    public void cambiarClave(String claveVieja, String claveNueva){
        if(claveVieja.equals(clave)){
            this.clave = claveNueva;
        }else{
            System.out.println("LA clave no coincide");
        }
    }
    
    public void calcularEdad (){
        GregorianCalendar hoy = new GregorianCalendar();      
        int anioHoy = hoy.getTime().getYear();
        int anioNaci = this.fechaNaci.getYear();
        this.edad = anioHoy - anioNaci;                              
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNaci=" + fechaNaci + ", edad=" + edad + ", clave=" + clave + '}';
    }
    
    
}
