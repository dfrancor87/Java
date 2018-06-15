/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaSimple;


/**
 *
 * @author Danny Franco
 */
public class Cercle {
    private double radio;
    
    public Cercle(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    
    
    public double calcularCircumferencia(){       
        return 2 * Math.PI * radio;  
    }
    
    public double calcularArea(){
        return  Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "El radio es: "+radio;
    }
    
    
    
    
    
}
