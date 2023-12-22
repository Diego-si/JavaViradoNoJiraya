package academy.devdojo.maratonajava.javacore.concorrencia.test;

import academy.devdojo.maratonajava.javacore.concorrencia.dominio.Quote;
import academy.devdojo.maratonajava.javacore.concorrencia.service.StoreServiceWithDiscount;

import java.util.List;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount service = new StoreServiceWithDiscount();
        searchPricesWithDiscount(service);
    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service) {
        List<String> stores = List.of("Store 1","Store 2","Store 3","Store 4");
        stores.stream()
                .map(service::getPriceSync)
                .map(Quote::newQuote)
                .map(service::applyDiscount)
                .forEach(System.out::println);
    }
}
