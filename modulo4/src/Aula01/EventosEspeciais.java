package Aula01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class EventosEspeciais {
    public static void main(String[] args) {
        System.out.println("Data de nasc: "+evento1());
        System.out.println("Hora de nasc: "+evento2());
        System.out.println("Ingresso na PM: "+evento3());

    }
    public static LocalDate evento1(){
        LocalDate nasc = LocalDate.of(1992, Month.MARCH,5);
        return nasc;
    }
    public static LocalTime evento2(){
        LocalTime horaNasc = LocalTime.of(02,00);
        return horaNasc;
    }
    public static LocalDateTime evento3(){
        LocalDateTime pol = LocalDateTime.of(
                2013, Month.MAY,10, 14,00);
        return pol;
    }
}
