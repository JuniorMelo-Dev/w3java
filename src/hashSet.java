import java.util.HashSet;

public class hashSet {

    public static void main(String[] args) {

        // HashSet é uma coleção de itens onde cada item é único
        HashSet<String> cursos = new HashSet<>();

        // Adicionando itens ao hashSet()
        cursos.add("MySQL");
        cursos.add("Java");
        cursos.add("JavaScript");
        cursos.add("NodeJS");
        cursos.add("TypeScript");
        cursos.add("Angular");
        cursos.add("MongoDB");
        System.out.println(cursos);

        // Verificar se um item existe
        System.out.println(cursos.contains("Java"));
    }

}
