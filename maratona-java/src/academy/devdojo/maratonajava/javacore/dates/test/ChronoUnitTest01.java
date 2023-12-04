package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniv = LocalDateTime.of(1988, Month.AUGUST,1,12,0,0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniv, now));
        System.out.println(ChronoUnit.WEEKS.between(aniv, now));
        System.out.println(ChronoUnit.MONTHS.between(aniv, now));
        System.out.println(ChronoUnit.YEARS.between(aniv, now));
    }
}
