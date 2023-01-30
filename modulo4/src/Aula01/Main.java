package Aula01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        
        /*//LocalDate
        //AAAA-MM-DD

        LocalDate dataLocal = LocalDate.parse("1992-03-05");

        dataLocal = dataLocal.plusDays(5);
        dataLocal = dataLocal.minusMonths(2);
        dataLocal = dataLocal.minus(5, ChronoUnit.MONTHS);
        System.out.println("dataLocal = " + dataLocal);
        System.out.println("ano = " + dataLocal.getYear());*/
        
        /*//LocalTime
        //HH:MM:SS:NANOSECOND
        LocalTime hora;// = LocalTime.now();
        hora = LocalTime.parse("19:00:02");
        hora= hora.plus(6, ChronoUnit.HOURS);
        System.out.println("hora = " + hora);
        System.out.println("segundos = " + hora.getSecond());*/

        /*//LocalDateTime
        //AAAA-MM-DDTHH:MM:SS:NANOSECOND
        LocalDate dataLocal = LocalDate.parse("1992-03-05");
        LocalTime hora = LocalTime.now();
        LocalDateTime dataEHora;// = LocalDateTime.now();
        //dataEHora = LocalDateTime.parse("2023-01-30T23:49:40");
        //dataEHora = dataEHora.plus(2, ChronoUnit.HOURS);
        dataEHora = dataLocal.atTime(hora.plusMinutes(20));
        LocalDate data = dataEHora.toLocalDate();
        System.out.println("dataEHora = " + dataEHora);
        System.out.println("só data = " + dataEHora.toLocalDate());
        System.out.println("data = " + data);
        LocalDate data = LocalDate.now();
        LocalTime horario = LocalTime.now();

        LocalDateTime dataHora = LocalDateTime.of(2022,03,05,02,00,00);
        System.out.println("Data e hora usando LocalDateTime.of(data, horario): " + dataHora);

        //dataHora = LocalDateTime.now();
        //System.out.println("Data e hora usando LocalDateTime.now(): " + dataHora);*/


    }
}
