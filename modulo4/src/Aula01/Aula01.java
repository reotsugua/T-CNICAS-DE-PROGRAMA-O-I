package Aula01;


import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula01 {
    public static void main(String[] args) {
        /*Date date =  new Date();
        System.out.println("date = " + date);

        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);

        GregorianCalendar gregorianCalendar = new GregorianCalendar();*/

        LocalDate hoje = LocalDate.now();
        System.out.println("hoje = " + hoje);

        LocalTime agora = LocalTime.now();
        System.out.println("agora = " + agora);

        LocalDateTime hojeAgora = LocalDateTime.now();
        System.out.println("hojeAgora = " + hojeAgora);

        ZonedDateTime zonaAgora = ZonedDateTime.now();
        System.out.println("zonaAgora = " + zonaAgora);

        LocalDate niver = LocalDate.of(1992, Month.MARCH, 5);
        LocalDate niver1 = LocalDate.of(1992, 3, 5);
        System.out.println("niver = " + niver);
        System.out.println("niver1 = " + niver1);

        LocalTime intervalo = LocalTime.of(20,45,20);
        LocalDateTime niverHorario = LocalDateTime.of(niver, intervalo);
        System.out.println("niverHorario.format(DateTimeFormatter.ofPattern(\"dd/MM/yyyy\")) = " + niverHorario.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

    }
    
    
}
