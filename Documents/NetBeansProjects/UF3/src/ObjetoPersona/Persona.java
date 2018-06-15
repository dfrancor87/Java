package ObjetoPersona;

import java.io.Serializable;

/**
 *
 * @author HANHAN
 */


public class Persona implements Serializable {

    private String colorOjos;
    private boolean sexo; //true mujer y false hombre
    private String nacionalidad;

    public Persona(String colorOjos, boolean sexo, String nacionalidad) {
        this.colorOjos = colorOjos;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public boolean isSexo() {
        return sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        
        String genero;
        
        genero = sexo ? "mujer":"hombre";
        
        return "Persona{" + "colorOjos=" + colorOjos + ", sexo=" + genero + ", nacionalidad=" + nacionalidad + '}';
    }
    
    

}
