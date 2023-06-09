import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();

//      Adicionando Chave e Valor ao objeto
        capitalCities.put("Brazil", "Brasilia");
        capitalCities.put("EUA", "Washington DC");
        capitalCities.put("Alemanha", "Berlin");
        capitalCities.put("Russia", "Moscou");

//      System.out.println(capitalCities);

//      Acessar um item
        System.out.println(capitalCities.get("Brazil"));
        
//      Remover um item
        System.out.println(capitalCities.remove("EUA"));

//      Quantidade de itens
        
//      Percorrendo um HashMap com forEach()
//      Use .keySet() para retornar a chave e .values() para retornar os valores
        for (String i : capitalCities.keySet()) {
            System.out.println("Chave: " + i + " valor: " + capitalCities.get(i));
        }
        
    }
}
