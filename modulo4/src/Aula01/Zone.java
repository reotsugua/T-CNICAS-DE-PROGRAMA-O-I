package Aula01;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zone {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("Africa/Lagos");


        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        ZonedDateTime zonedAqui = ZonedDateTime.now();
        ZonedDateTime dateTimeCombinado = ZonedDateTime.of(LocalDateTime.now(), zoneId);
        OffsetDateTime now = OffsetDateTime.now();

        System.out.println("zoneId = " + zoneId);
        System.out.println("zone sem mudar = " + dateTimeCombinado);
        System.out.println("zonedAqui = " + zonedAqui);
        System.out.println("now sem o nome da cidade= " + now);
        System.out.println("zonedDateTime = " + zonedDateTime);

        //Outro jeito de fazer
        System.out.println("zonedDateTime = " +zonedAqui.withZoneSameInstant(zoneId));



    }
}
