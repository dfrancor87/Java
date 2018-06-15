/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosCoche;

import java.util.*;
import java.io.*;

/**
 *
 * @author Danfer
 */
public class Coche implements Serializable {

    private String matricula;
    private String color;
    private String marca;
    private String modelo;
    private double precio;
    private int plazas;

    //constructor
    public Coche(String matricula, String color, String marca, String modelo, double precio, int plazas) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.plazas = plazas;
    }

    public Coche() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("=====Datos del coche=====");
        System.out.println("Matricula?:  ");
        //leemos los datos de la matricula
        matricula = entrada.nextLine();
        //leer datos de color
        System.out.println("Color: ");
        color = entrada.next();
        //leer datos de marca
        System.out.println("Marca: ");
        marca = entrada.next();
        //leer datos de modelo
        System.out.println("Modelo: ");
        modelo = entrada.nextLine();
        //leer el precio
        System.out.println("Precio: ");
        precio = entrada.nextDouble();
        //leer el numero de plazas 
        System.out.println("Precio: ");
        precio = entrada.nextInt();
    }

    //ToString
    @Override
    public String toString() {
        return "coche{" + "matricula=" + matricula + ", color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", plazas=" + plazas + '}';
    }

}
