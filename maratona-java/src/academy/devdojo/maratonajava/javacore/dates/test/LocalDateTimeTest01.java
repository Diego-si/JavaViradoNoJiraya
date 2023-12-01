package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2023-12-01");
        LocalTime time = LocalTime.of(9,41,21);
        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ld1 = date.atTime(time);
        LocalDateTime ld2 = time.atDate(date);
        System.out.println(ld1);
        System.out.println(ld2);
    }
}
