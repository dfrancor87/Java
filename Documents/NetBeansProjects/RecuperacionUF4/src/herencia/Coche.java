/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Danny Franco
 */
public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    // SETTER
    public void editaColor(String color) {
        this.color = color;
    }

    public void configuraAsientos(String respuesta) {
        if (respuesta.equals("si")) {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }
    
    public void configuraClimatizador(String respuesta){
        if (respuesta.equals("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    public String datos() {
        return "Tiene "+ruedas+" ruedas,  mide mas de "+largo/1000 +" metros y de ancho "+
                ancho+"cm. y la plataforma pesa "+peso_plataforma+"kg";
    }

    public String dimeColor() {
        return "El color es "+color;
    }
}
