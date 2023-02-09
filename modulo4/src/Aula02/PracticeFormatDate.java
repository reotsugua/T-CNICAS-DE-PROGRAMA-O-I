package Aula02;

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
        System.out.println(agora.format(DateTimeFormatter.ofPattern("'São Paulo 'dd 'de' MMMM 'de' yyyy")));



    }
}
