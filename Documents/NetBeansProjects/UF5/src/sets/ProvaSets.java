package sets;

import java.util.HashSet;
import java.util.TreeSet;

/**
 *
 * @author Danny Franco
 */
public class ProvaSets {

    public static void main(String[] args) {
        TreeSet<String> s1 = new TreeSet();
        s1.add("hola");
        s1.add("adeu");
        s1.add("ciao");
        s1.add("hola");
        s1.add("blabla");
        //for each
        for (String s : s1) {
            System.out.print(s + " ");
        }

        System.out.println("*************");
        HashSet <String> s2 = new HashSet();
        s2.add("hola");
        s2.add("adeu");
        s2.add("ciao");
        s2.add("hola");
        s2.add("blabla");
        //for each
        for (String s : s2) {
            System.out.println(s + " ");
        }
        
        
        System.out.println("****************");
        TreeSet<Cosa> c = new TreeSet();
        c.add(new Cosa(1, "taula"));
        c.add(new Cosa(1,"aula"));
        c.add(new Cosa(2,"cadira"));
        c.add(new Cosa(34,"llapis"));
        c.add(new Cosa(1,"cadira"));
        //for each
        for (Cosa x : c) {
            System.out.print(x + " ");
        }
    }

}
