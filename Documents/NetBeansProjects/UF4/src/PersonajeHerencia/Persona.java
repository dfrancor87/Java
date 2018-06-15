package PersonajeHerencia;

/**
 *
 * @author Danfer
 */
public class Persona {
        private String nom;
        private int edad;

        //constructor sin parametros
        public Persona(){
            edad =15;
            nom = "Pepito";
        }
        //Constructor con parametros
        public Persona(String n, int e){
            nom= n;
            edad=e;
        }
        //Seter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //Funcion o metodo
    public void parlar(){
        System.out.println("Hola me llamo "+nom+" y tengo "+edad);
    }
        
              
}
