package Aula02;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Exercicio {
    public static void main(String[] args) {
        LocalDate dataInicial = LocalDate.of(2023, 1, 8);
        LocalDate dateFinal = LocalDate.of(2023, 4, 8);
        System.out.println("Data Inicial = " + dataInicial);

        Period mes = Period.ofMonths(1);
        Period period = Period.of(0, 1, 5);

        LocalDate dataSegundaDose = dataInicial.plus(mes);
        LocalDate dataTerceiraDose = dataSegundaDose.plus(period);


        System.out.println("dataSegundaDose = " + dataSegundaDose);
        System.out.println("dataTerceiraDose = " + dataTerceiraDose);

        LocalDate dataDose = dataInicial;
        while (dataDose.isBefore(dateFinal)) {
            System.out.println("Dose tomada em: " + dataDose);
            dataDose = dataDose.plus(period);
        }
    }
}
