package academy.devdojo.maratonajava.javacore.padroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio.Country;
import academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio.Currency;
import academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio.CurrrencyFactory;

public class CurrencyTest01 {
    public static void main(String[] args) {
        Currency currency = CurrrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
