
package museuRoger;

/**
 *
 * @author Roger Duñó
 */
public class MuseuDeLleida {
    public static void main(String[] args) {
        Obra a=new Quadre("Mona Lisa", 400, 200);
        Obra q=new Quadre("El Grito", "Edvard Munch", 91, 74);
        Obra e=new Escultura("Michael", 90);
        System.out.println(a.toString());
        System.out.println(q.toString());
        System.out.println(e.toString());
        System.out.println(Obra.getCont());
    }
}
