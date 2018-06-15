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
public class Furgoneta extends Coche{
    
    private int capacidad_carga;
    private int plazas_extra;

    public Furgoneta(int capacidad_carga, int plazas_extra) {
        //llama al constructor de la clase padre a Coche
        // en este caso el constructor de Coche ya tiene valores predefinidos
        // super() hereda todos el constructor de COche
        super();
        this.capacidad_carga = capacidad_carga;
        this.plazas_extra  = plazas_extra;
        
    }
    
    public String dimeDatosFurgoneta(){
        return "La capacidad de carga es: "+ this.capacidad_carga+" y las plazas "+ this.plazas_extra;
    }
    

   
    
}
