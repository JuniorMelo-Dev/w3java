import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Data {
    
    // Para exibir a data atual, importe a java.time.LocalDateclasse e use seu método now():

    public static void main(String[] args) {
        
        LocalDate myObj = LocalDate.now(); // Exibir a data atual
        System.out.println(myObj);

        LocalTime myObj2 = LocalTime.now(); // Exibir a hora atual
        System.out.println(myObj2);
        
        LocalDateTime myObj3 = LocalDateTime.now(); // Exibir a data e hora atuais
        System.out.println("Sem Formatação: " + myObj3);

        DateTimeFormatter formatandoMeuObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String dataFormatada = myObj3.format(formatandoMeuObj);
        System.out.println("Com Formatação: " + dataFormatada);
    }
}
