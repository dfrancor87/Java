/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraordinariaUF4;

/**
 *
 * @author Danny Franco
 */
public class Tablet extends DispositivoMovil{
    private int polsades;

    public Tablet(int polsades, String marca, String model, Double preubase) {
        super(marca, model, preubase);
        this.polsades = polsades;
    }

    public Tablet() {
    }
    
    

    @Override
    public String toString() {
        //return "Tablet{" + "polsades=" + polsades + '}';
        return "Tableta: "+" Marca: "+this.getMarca()+" modelo: "+this.getModel()+" Pulgadas "+polsades+" Preu Base: "+this.getPreuBase();
    }
    

    public String isGamaAlta(double preu) {
       // System.out.println("EL PREU QUE LLEGAES "+preu);
        if(preu > 500){
            return "Es gama alta";
        }else{
            return "No es gama alta";
        }
    }

    
    
    

   
    
    
}
