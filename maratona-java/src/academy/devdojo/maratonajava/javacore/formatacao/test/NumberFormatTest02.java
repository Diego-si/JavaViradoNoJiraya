package academy.devdojo.maratonajava.javacore.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nf = new NumberFormat[4];
        nf[0] = NumberFormat.getCurrencyInstance();
        nf[1] = NumberFormat.getCurrencyInstance(localePT);
        nf[2] = NumberFormat.getCurrencyInstance(localeJP);
        nf[3] = NumberFormat.getCurrencyInstance(localeIT);
        double valor = 1000.2130;
        for (NumberFormat numberFormat: nf) {
            System.out.println(numberFormat.getMaximumFractionDigits());

            System.out.println(numberFormat.format(valor));
        }
        String valorString = "R$ 1.000,21";
        try {
            System.out.println(nf[0].parse(valorString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
