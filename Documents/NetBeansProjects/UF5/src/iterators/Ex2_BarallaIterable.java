package iterators;

import java.util.Iterator;

/**
 * Una baralla serà iterable si implementa la interface Iterable, que és la que
 * assumeixen els bucles for-each "moderns". És a dir, per tal de fer servir un
 * bucle for-each per una estructura (exemple) com aquesta baralla de naips, ha
 * d'implementar la intercace Iterable i, per tant, tenir un mètode public
 * Iterator iterator(). L'iterador ha d'estar predefinit, aquí utilitzem una 
 * classe auxiliar anomenada Ex2_IteratorBaralla
 *
 * @version gener 2014
 * @author Montse
 * @see java.util.Iterator
 * @see java.lang.Iterable
 *
 */
public class Ex2_BarallaIterable implements Iterable {

    private Naip[] cartes;
  //  private int indexIterator;
    private int actual;

    @Override
    public Iterator iterator() {
        //la classe que itera és auxiliar i oculta a la resta del programa
        return new Ex2_IteratorBaralla(cartes, actual);// indexIterator);
    }

    public Ex2_BarallaIterable() {
        cartes = new Naip[10];
    }

    public void afegirNaip(Naip p) {
        cartes[actual++] = p;
    }

    public static void main(String[] args) {
        Ex2_BarallaIterable b = new Ex2_BarallaIterable();
        b.afegirNaip(new Naip(2, "Bastos"));
        b.afegirNaip(new Naip(3, "Bastos"));
        b.afegirNaip(new Naip(4, "Espadas"));
        b.afegirNaip(new Naip(1, "Oros"));
        b.afegirNaip(new Naip(5, "Copas"));

        //Utilització del patró Iterator
        System.out.println("Iterant amb next() i hasNext()");
        Iterator it = b.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
//Utilització dels bucles for-each
        System.out.println("Iterant amb bucle for-each");
        for (Object n : b) {
            System.out.println(n);
        }

    }

    //Aquí comença la classe auxiliar
    class Ex2_IteratorBaralla implements Iterator {

        private Naip[] cartes;
        private int index;
        private int actual;

        public Ex2_IteratorBaralla(Naip[] c, int act){//, int ind) {
            cartes = c;
            actual = act;
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index != actual;
        }

        @Override
        public Object next() {
            return cartes[index++];
        }

        @Override
        public void remove() {
        }
    }
}
