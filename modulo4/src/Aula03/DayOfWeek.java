package Aula03;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfWeek {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        java.time.DayOfWeek dayOfWeek = now.getDayOfWeek();

        System.out.println(dayOfWeek.getDisplayName(TextStyle.FULL, Locale.getDefault()));
        System.out.println(dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.getDefault()));
        System.out.println(dayOfWeek.getDisplayName(TextStyle.NARROW, Locale.getDefault()));

    }
}
