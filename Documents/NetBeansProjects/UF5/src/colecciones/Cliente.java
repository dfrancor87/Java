
package colecciones;

import java.util.Objects;

/**
 *
 * @author Danny Franco
 */
public class Cliente {
    private String nombre;
    private String n_cuenta;
    private double saldo;
    
    public Cliente(String nom, String cuen, double sal){
        nombre = nom;
        n_cuenta = cuen;
        saldo = sal;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    // para que no se repitan 
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.n_cuenta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.n_cuenta, other.n_cuenta)) {
            return false;
        }
        return true;
    }
     
   
}
