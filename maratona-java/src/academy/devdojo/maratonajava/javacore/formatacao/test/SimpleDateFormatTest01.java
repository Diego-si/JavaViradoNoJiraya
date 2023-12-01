package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String patterm = "yyyy.MM.dd G 'at' HH:mm:ss z";
        String patterm2 = "'Amsterdam' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sd = new SimpleDateFormat(patterm2);
        System.out.println(sd.format(new Date()));
        try {
            System.out.println(sd.parse("Amsterdam 01 de dezembro de 2023"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
