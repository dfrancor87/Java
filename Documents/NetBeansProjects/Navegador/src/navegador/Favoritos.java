/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navegador;

/**
 *
 * @author Danny Franco
 */
public class Favoritos {
    private String url;
    private String nombre;

    public Favoritos(String url, String nombre) {
        this.url = url;
        this.nombre = nombre;
    }
     public Favoritos(String url) {
        this.url = url;        
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Url: "+ url + " Nombre: "+ nombre+"\n";
    }
    
    
}
