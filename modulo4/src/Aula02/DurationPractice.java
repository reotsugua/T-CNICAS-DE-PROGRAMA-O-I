package Aula02;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationPractice {
    public static void main(String[] args) {
        Duration doisDias = Duration.ofDays(2);
        System.out.println("doisDias = " + doisDias);
        Duration tresMinutos = Duration.ofMinutes(3);
        System.out.println("tresMinutos = " + tresMinutos);
        Duration cincoSegundos = Duration.ofSeconds(5);
        System.out.println("cincoSegundos = " + cincoSegundos);
        Duration of = Duration.of(10, ChronoUnit.MINUTES);
        System.out.println("of = " + of);

        LocalTime agora = LocalTime.now();
        System.out.println("agora.plus(tresMinutos) = " + agora.plus(tresMinutos));
        System.out.println("agora.plus(of) = " + agora.plus(of));
    }
}
