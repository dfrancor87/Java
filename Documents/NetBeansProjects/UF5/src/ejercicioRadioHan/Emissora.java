/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioRadioHan;

/**
 *
 * @author HANHAN
 */
public class Emissora {
    
    private double frecuencia;
    private String especialidad;
    private String nombre;
    
    public Emissora(String nombre, String especialidad, double frecuencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.frecuencia = frecuencia;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    @Override
    public String toString() {
        return "Emissora{" + "frecuencia=" + frecuencia + ", especialidad=" + especialidad + ", nombre=" + nombre + '}';
    }
    
    
    

    
}
