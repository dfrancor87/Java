package PersonajeHerencia;

import PersonajeHerencia.Persona;

/**
 *
 * @author Danfer
 */
public class Programador extends Persona{//extens --->Herencia
    private String lenguaje;

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    //toString

    @Override
    public void parlar(){
        super.parlar();
        System.out.println("Y también sé: "+lenguaje);
    }
    
    
    
    
}
