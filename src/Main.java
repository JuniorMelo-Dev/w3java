import java.util.HashSet;

class Main {
    public static void main(String[] args) {

        HashSet<Integer> numeros = new HashSet<Integer>();

        // Adicionando valores ao HashSet
        numeros.add(9);
        numeros.add(26);
        numeros.add(15);
        numeros.add(18);

        for (int i = 1; i <= 30; i++) {
            if(numeros.contains(i)) {
                System.out.println(i + " foi encontrado no Set.");
            } else {
                System.out.println(i + " não foi encontrado no Set.");
            }
        }
    }
}
