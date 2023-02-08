package Aula02;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodPractice {
    public static void main(String[] args) {
        Period cincoAnos = Period.ofYears(5);
        Period doisDias = Period.ofDays(2);
        Period umaSemana = Period.ofWeeks(1);
        Period umMes = Period.ofMonths(1);
        System.out.println("umAno = " + cincoAnos);
        System.out.println("umDia = " + doisDias);
        System.out.println("umaSemana = " + umaSemana);
        System.out.println("umMes = " + umMes);

        LocalDate hoje = LocalDate.of(2023 , Month.JANUARY, 31);
        System.out.println("hoje = " + hoje);
        System.out.println("hoje + umMes = " + hoje.plus(umMes));
    }
}
