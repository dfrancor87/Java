

package museu;

/**
 *
 * @author Hanhan
 */
public class ProvaMuseu {
    public static void main(String[] args) {
        Obra obres [] = new Obra[3];
        obres[0] = new Quadre("La Creacion de Adan", "Miguel Angel");
        obres[1] = new Quadre("Guernica", "Picasso");
        obres[2] = new Escultura("Escultura de David","Miguel Angel");
        
        for(Obra obra : obres){
            System.out.println("");
            System.out.println(obra.toString());
            System.out.println("Nombre obra "+obra.getNom());
        }
        
    }
}
