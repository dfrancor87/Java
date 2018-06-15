/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Danny Franco
 */
public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private int anio;
    private float consumo;

    public Vehiculo(String matricula, String marca, String modelo, int anio) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void calcularAutonomia(float litros, float km) {
        System.out.println("pasa por aqui "+litros+"  "+km);
        this.consumo = ((litros/km)*100);                
    }

    public float getConsumo() {
        return consumo;
    }


    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("0514-sk", "opel", "astra", 2000);
        float litros = 50;
        float km = 200;
        v1.calcularAutonomia(50, 200);
        
        System.out.println("consume: "+v1.getConsumo()+" litros cada "+km);

    }

}
