package Aula01;

/*import java.time.LocalDate;

public class Vacina {
    public static void main(String[] args) {

        LocalDate dataInicial = LocalDate.of(2023,01,06);
        LocalDate dataFinal = LocalDate.of(2023,04,30);

        System.out.println("Data Inicial = " + dataInicial);
        LocalDate segundaDose = dataInicial.plusMonths(1);
        LocalDate terceiraDose = segundaDose.plusMonths(1);

        System.out.println("segunda Dose = " + segundaDose);
        System.out.println("terceira Dose = " + terceiraDose);
    }
}*/
/*import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vacina {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 2, 1);
        LocalDate endDate = LocalDate.of(2022, 9, 1);

        long monthsBetween = ChronoUnit.MONTHS.between(startDate, endDate);

        LocalDate currentDate = startDate;
        for (int i = 0; i <= monthsBetween; i++) {
            System.out.println("Dose tomada em: " + currentDate);
            currentDate = currentDate.plusMonths(1);
        }
    }
}*/

import java.time.LocalDate;

public class Vacina {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 2, 1);
        LocalDate endDate = LocalDate.of(2022, 5, 1);

        LocalDate currentDate = startDate;
        while (currentDate.isBefore(endDate)) {
            System.out.println("Dose tomada em: " + currentDate);
            currentDate = currentDate.plusMonths(1);
        }
    }
}
