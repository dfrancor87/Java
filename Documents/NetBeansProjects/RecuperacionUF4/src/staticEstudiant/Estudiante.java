/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticEstudiant;

/**
 *
 * @author Danny Franco
 */
public class Estudiante {

    private String nombre;
    private String apellido;
    private double notaMedia;
    
    private static String nomInsti = "Jaume Balmes";

    public Estudiante(String nombre, String apellido, double notaMedia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaMedia = notaMedia;
    }

    public void setNombre() {
        this.nombre = nombre.toUpperCase();
    }

    public void setApellido() {
        this.apellido = apellido.toUpperCase();
    }

    public static void setNomInsti() {
        Estudiante.nomInsti = "Institut Jaume Balmes";
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", notaMedia=" + notaMedia + " insituto: "+nomInsti;
    }
    
    
    
    
    
    
  

}
