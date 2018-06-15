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
public class Altres  extends DispositivoMovil{
    private String descripcion;

    public Altres(String marca, String model, Double preubase, String descripcion) {
        super(marca, model, preubase);
        this.descripcion = descripcion;
    }

    public Altres() {
    }

    @Override
    public String toString() {
       //  return "Qualsevol " + "Descripcion:" + descripcion;
         return "Altres, Descripcion " + descripcion +" Marca: "+this.getMarca()+" modelo: "+this.getModel()+" Preu Base: "+this.getPreuBase();
    }

//    @Override
//    public String toString() {
//        return "Altres{" + "Descripcion=" + descripcion + '}';
//    }

     
    
    
}
