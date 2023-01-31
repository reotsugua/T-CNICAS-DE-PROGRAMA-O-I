package Aula01;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Zone {
    public static void main(String[] args) {
        ZoneId zoneId = ZoneId.of("America/Cuiaba");

        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);

        System.out.println("zoneId = " + zoneId);
        System.out.println("zonedDateTime = " + zonedDateTime);
    }
}
