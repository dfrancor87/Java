package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Danny Franco
 */
public class ExercicisSobreArrayList {

    public static void main(String[] args) {

        ArrayList<String> llista1 = new ArrayList();
        llista1.add("Director");
        llista1.add("Dinamo");
        llista1.add(0, "tres");
        llista1.add(3, "Vehiculo");

        System.out.println(llista1);
        ArrayList<String> llista2 = new ArrayList();
        llista2.addAll(Arrays.asList("un", "dos", "tres"));
        System.out.println(llista2);

        llista1.addAll(llista2);
        System.out.println(llista1);

        llista1.addAll(2, llista2);
        System.out.println(llista1);

        System.out.println(llista1.indexOf("tres"));

        System.out.println(llista1.get((int) llista1.size() / 2));

        //Collections.sort(llista1);
        System.out.println(llista1);

        llista1.set(0, "danny");
        System.out.println(llista1);
        
        ArrayList <String> sub = new ArrayList (llista1.subList(2, llista1.size()-2));
        System.out.println(sub);
        
        Iterator <String> it = llista1.iterator();
        while(it.hasNext()){
            String t = it.next();
            System.out.println(t);
        }
        
        for(String e:llista1){
            System.out.println(e);
        }
        
    }

}
