import java.util.ArrayList;
import java.util.Iterator;

public class hashSet {

    public static void main(String[] args) {

        // Iterator
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(25);
        numeros.add(59);
        numeros.add(48);
        numeros.add(2);
        numeros.add(16);
        Iterator<Integer> it = numeros.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 20) {
                it.remove();
            }
        }
        System.out.println("Restaram os números: " + numeros);
    }

}
