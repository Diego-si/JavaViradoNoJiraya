package academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio;

public class CurrrencyFactory {
    public static Currency newCurrency(Country country) {
        switch (country) {
            case USA:return new UsDollar();
            case BRAZIL:return new Real();
            default: throw new IllegalArgumentException("No currency found for the this country");
        }
    }
}
