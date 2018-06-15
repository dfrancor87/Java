package figuras;

import processing.core.PApplet;

/**
 *
 * @author Danny Franco
 */
public class Proves extends PApplet {

    public static void main(String[] args) {
        PApplet.main(new String[]{figuras.Proves.class.getName()});

    }

    Cuadrado cuadrado;
    Triangulo triangulo;
    Circulo circulo;
    
    private float radi;
    private float x;
    private float y;
    private float color;

    public void settings() {
        size(500, 500);
        cuadrado = new Cuadrado(25, 25, 50, this, 123);
        circulo = new Circulo(10, 10, 50, this, 123);
        triangulo = new Triangulo(500, 500,50, this, 123);

    }

    @Override
    public void draw() {

        radi = (float) Math.random() * 400;
        x = (float) Math.random() * 400;
        y = (float) Math.random() * 400;
        cuadrado.setX(x);
        cuadrado.setY(y);
        cuadrado.setRadi(radi);
        cuadrado.setColor(color);
        cuadrado.display();
        System.out.println("Area Cuadrado: " + cuadrado.calcularArea());
        circulo.setX(x);
        circulo.setY(y);
        circulo.setRadi(radi);
        circulo.setColor(color);
        circulo.display();
        System.out.println("Area de Circulo" + circulo.calcularArea());
        triangulo.setX(x);
        triangulo.setY(y);
        triangulo.setColor(color);
        triangulo.display();
        System.out.println("Area de Triangulo" + triangulo.calcularArea());
        
    }
}
