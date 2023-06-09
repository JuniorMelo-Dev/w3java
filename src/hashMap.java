import java.util.HashMap;

public class hashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> pessoas = new HashMap<String, Integer>();

        // Adicionando Chave e Valor
        pessoas.put("Junior", 33);
        pessoas.put("Luana", 30);
        pessoas.put("Bernardo", 8);
        pessoas.put("Helena", 3);

        for (String i : pessoas.keySet()) {
            System.out.println("Nome: " + i + " -------- Idade: " + pessoas.get(i));
        }
    }
}