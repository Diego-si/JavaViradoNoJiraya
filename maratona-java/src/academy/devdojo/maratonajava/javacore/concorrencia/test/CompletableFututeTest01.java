package academy.devdojo.maratonajava.javacore.concorrencia.test;

import academy.devdojo.maratonajava.javacore.concorrencia.service.StoreService;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableFututeTest01 {
    public static void main(String[] args) {
        StoreService storeService = new StoreService();
//        searchPricesSync(storeService);
//        searchPricesAsyncFuture(storeService);
        searchPricesAsyncCompletableFuture(storeService);
    }
    private static void searchPricesSync(StoreService service) {
        long start = System.currentTimeMillis();
        System.out.println(service.getPriceSync("Store 1"));
        System.out.println(service.getPriceSync("Store 2"));
        System.out.println(service.getPriceSync("Store 3"));
        System.out.println(service.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end-start));
    }

    private static void searchPricesAsyncFuture(StoreService service) {
        long start = System.currentTimeMillis();
        Future<Double> pricesAsyncFuture1 = service.getPricesAsyncFuture("Store 1");
        Future<Double> pricesAsyncFuture2 = service.getPricesAsyncFuture("Store 2");
        Future<Double> pricesAsyncFuture3 = service.getPricesAsyncFuture("Store 3");
        Future<Double> pricesAsyncFuture4 = service.getPricesAsyncFuture("Store 4");
        try {
            System.out.println(pricesAsyncFuture1.get());
            System.out.println(pricesAsyncFuture2.get());
            System.out.println(pricesAsyncFuture3.get());
            System.out.println(pricesAsyncFuture4.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end-start));
        StoreService.shutdown();
    }

    private static void searchPricesAsyncCompletableFuture(StoreService service) {
        long start = System.currentTimeMillis();
        CompletableFuture<Double> pricesAsyncFuture1 = service.getPricesAsyncCompletableFuture("Store 1");
        CompletableFuture<Double> pricesAsyncFuture2 = service.getPricesAsyncCompletableFuture("Store 2");
        CompletableFuture<Double> pricesAsyncFuture3 = service.getPricesAsyncCompletableFuture("Store 3");
        CompletableFuture<Double> pricesAsyncFuture4 = service.getPricesAsyncCompletableFuture("Store 4");
        System.out.println(pricesAsyncFuture1.join());
        System.out.println(pricesAsyncFuture2.join());
        System.out.println(pricesAsyncFuture3.join());
        System.out.println(pricesAsyncFuture4.join());

        long end = System.currentTimeMillis();
        System.out.printf("Time passed to searchPricesSync %dms%n", (end-start));
    }
}
