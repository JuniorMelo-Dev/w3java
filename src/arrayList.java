import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> meusNumeros = new ArrayList<Integer>();
        meusNumeros.add(16);
        meusNumeros.add(23);
        meusNumeros.add(665);
        meusNumeros.add(896);
        meusNumeros.add(-78);
        meusNumeros.add(10025);

        for (int i : meusNumeros) {
            System.out.println(i);
        }
    }

}
