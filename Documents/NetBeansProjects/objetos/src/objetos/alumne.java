/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author Danfer
 */
public class alumne {
    //Atributos de alumno
    private String nom;
    private int edad;
    private String grup;

      /*CONSTRUCTOR DE LA CLASE */
    public alumne(String nom, int edad, String grup) {
        this.nom = nom;
        this.edad = edad;
        this.grup = grup;
    }
    //GETTER PARA CONSULTAR
    public String getNom() {
        return nom;
    }
    //SETTER PARA MODIFICAR
    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    @Override
    public String toString() {
        return "alumne: " + "nom:" + nom + ", edad:" + edad + ", grup:" + grup ;
    }

    
    
    
    
}
