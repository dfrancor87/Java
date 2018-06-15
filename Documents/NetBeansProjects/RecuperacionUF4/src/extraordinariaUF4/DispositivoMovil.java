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
public abstract class DispositivoMovil {
    private String marca;
    private String model;
    private Double preuBase;    
    
    

    public DispositivoMovil(String marca, String model, Double preubase) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preubase;        
    }

    public DispositivoMovil() {
    }
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(Double preuBase) {
        this.preuBase = preuBase;
    }

   
    
//    @Override
//    public String toString() {
//        return "DispositivoMovil: " + "marca:" + marca + ", model:" + model + ", preu Base:" + preuBase;
//    }
    
    public abstract String toString();
  //   public abstract String isGamaAlta(double preu);
    

    
    
    
    
    
    
    
}
