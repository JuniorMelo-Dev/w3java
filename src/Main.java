import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        //método add() - adicionat um item
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Fiat");
        cars.add("GM");
        cars.add("Mazda");

        //Percorrendo um ArrayList com for()
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        //método sort() - ordenar alfabético ou numérico
        Collections.sort(cars);

        //Loop usando método for-each
        for (String i : cars) {
            System.out.println(i);
        }
/*
        //método get() - pegar um indice
        cars.get(3); 

        //método set() - alterar
        cars.set(0, "VW");

        //método remove() - remover um item
        cars.remove(0);

        //método clear() - limpa todos os elementos do ArrayList
        cars.clear();

        //método size() - para saber o quantos elementos tem o ArrayList
        cars.size();
*/

        
    }
}
