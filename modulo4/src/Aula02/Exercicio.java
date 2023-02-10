package Aula02;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exercicio {
    public static void main(String[] args) {
        /*LocalDate dataInicial = LocalDate.of(2023, 1, 8);
        LocalDate dateFinal = LocalDate.of(2023, 4, 8);*/
        String dataI = "09/01/2023";
        String dataF = "09/04/2023";
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataInicial = LocalDate.parse(dataI, formatter);
        LocalDate dataFinal = LocalDate.parse(dataF, formatter);

        System.out.println("Data Inicial = " + dataInicial);
        System.out.println("dataFinal = " + dataFinal);

        Period mes = Period.ofMonths(1);
        Period period = Period.of(0, 1, 5);

        LocalDate dataSegundaDose = dataInicial.plus(mes);
        LocalDate dataTerceiraDose = dataSegundaDose.plus(period);


        System.out.println("dataSegundaDose = " + dataSegundaDose);
        System.out.println("dataTerceiraDose = " + dataTerceiraDose);

        LocalDate dataDose = dataInicial;
        while (dataDose.isBefore(dataFinal)) {
            System.out.println("Dose tomada em: " + dataDose.format(DateTimeFormatter.ofPattern("dd/MM/yyyy" + " EEEE")));
            dataDose = dataDose.plus(period);
        }

        LocalDate now = LocalDate.now();
        //Aparecer dida da Semana
        System.out.println(now.format(DateTimeFormatter.ofPattern("EEEE")));
    }
}
