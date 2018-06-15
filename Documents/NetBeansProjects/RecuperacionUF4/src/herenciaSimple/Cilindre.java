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
public class Cilindre extends Cercle {
    
    private double altura;

    public Cilindre(double altura, double radio) {
        // constructor de la clase Cercle
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    
    public double calcularVolum(){
        return Math.PI * this.getRadio() * this.getRadio() * this.getAltura();        
    }
    
     public double calcularArea(){
        return (Math.PI * this.getRadio() * this.getRadio()) + (this.getRadio() *this.getRadio())+ (2 * this.getRadio()*this.getRadio()) ;        
       // return 1;
    } 

    
   
    
    
}
