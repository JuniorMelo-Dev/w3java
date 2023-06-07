import java.util.Scanner; // Importando a classe Scanner

class Entrada {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Criando o objeto Scanner

        /*
         * // Opção 01 -- Saída usando o método nextLine()
         * System.out.println("Entre com seu nome");
         * 
         * String nome = myObj.nextLine(); // Lendo entrada do usuário
         * System.out.println("Seu nome é: " + nome); // Saída para o usuário
         * 
         */

        // Opção 02 -- Saída com vários tipos
        System.out.println("Entre com seu nome, idade e salário:");

        // Entrada do tipo String
        String nome = myObj.nextLine();

        // Entrada do tipo numérico
        int idade = myObj.nextInt();
        double salario = myObj.nextDouble();

        // Output input by user
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);

        myObj.close(); // Finalizando o objeto
    }
}