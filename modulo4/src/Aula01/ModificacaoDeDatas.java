package Aula01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ModificacaoDeDatas {
    public static void main(String[] args) {
        LocalDate data = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println("data = " + data);

        data = data.plusDays(3);
        System.out.println("data + 2 dias = " + data);

        data = data.plusWeeks(1);
        System.out.println("data + 1 semana = " + data);

        data = data.plusMonths(1);
        System.out.println("data + 1 mes = " + data);
        System.out.println("data.isLeapYear() = " + data.isLeapYear());
        System.out.println("data.isLeapYear(2016) = " + data.plusYears(2).isLeapYear());

        LocalTime hora = LocalTime.of(20,20);
        hora = hora.minus(2, ChronoUnit.HOURS);
        System.out.println("hora = " + hora);
    }
}
