/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Figuras;

import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public class provaFiguras extends PApplet {

    // atributos de clase 
    Triangulo triangulo;
    Cercle cercle;
    Quadrat quadrat;

    //posiciones de donde lo queremos printar
    private float posX;
    private float posY;   
    //atributo pra el tamaño de circle
    private float nouRadi;
    
    
    /* metrodo MAIN */
    public static void main(String[] args) {
        PApplet.main("Figuras.provaFiguras");
    }

    /**
     * Poner las medidas del marco donde pondremos las figuras
     */
    public void settings() {
        size(500, 500);
    }

    // instanciar objetos y mostrarlos por primera vez
    public void setup() {
        //instanciamos los objs con una posicion,radio y color inicial
        // luego lo cambiamos en el draw()
        triangulo = new Triangulo(this, 20, 20, 100, 100);
        cercle = new Cercle(this, 100, 100, 100, 0);
        quadrat = new Quadrat(this, 100, 100, 100, 100);
    }

    // metodo para pintar, bucle infinito
    public void draw() {
        //valores a las posisciones x, y
        // hacemos un cast xq solo acepta float
        // 500 xq es el tamaña de la ventana
        posX = (float) Math.random() * 500;
        posY = (float) Math.random() * 500;
        nouRadi = (float) Math.random() *250;

        // le ponemos las posiciones donde queremos que los muestre
        triangulo.setX(posX);
        triangulo.setY(posY);
        triangulo.display();
        System.out.println("el area es: " + triangulo.calcularArea());
        
        cercle.setX(posX);
        cercle.setY(posY);
        cercle.setRadi(nouRadi);
        cercle.display();
        System.out.println("el area es: " + cercle.calcularArea());
        
        quadrat.setX(posX);
        quadrat.setY(posY);
        quadrat.setRadi(nouRadi);
        quadrat.display();
        System.out.println("el area es: " + quadrat.calcularArea());

        
       
        

    }
}
