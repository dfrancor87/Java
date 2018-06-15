/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenuf3;

/**
 *
 * @author Danfer
 */
import java.io.Serializable;

public class Lletra implements Serializable {

    private String familia;
    private double grandaria;
    private String color;
    private boolean bold;

    //constructor
    public Lletra(String familia, double grandaria, String color, boolean bold) {
        this.familia = familia;
        this.grandaria = grandaria;
        this.color = color;
        this.bold = bold;
    }

    //getter

    public boolean isBold() {
        return bold;
    }
  

    //toString
    @Override
    public String toString() {
        String salida = "";
        salida = "familia: " + familia + ", grandaria: " + grandaria + ", color: " + color + ", bold: ";
        if (bold) {
            return salida += " Si";
        } else {
            return salida += " No";
        }
    }

}


