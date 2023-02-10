package Aula02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PracticeFormatDate {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();


        System.out.println(agora.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(agora.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(agora.format(DateTimeFormatter.ISO_LOCAL_TIME));

        System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a")));

        System.out.println(agora.format(DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy")));
        System.out.println(agora.format(DateTimeFormatter.ofPattern("'São Paulo, 'dd 'de' MMMM 'de' yyyy")));

        String dataString = "12/01/2023";
        String dataTime = "12/02/2023 22:08";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(dataString, formatter);

        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime time = LocalDateTime.parse(dataTime, formatado);

        
        
        
        System.out.println("dataFormatada = " + data);
        System.out.println("time = " + time);
        System.out.println(time.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a")));
    }
}
