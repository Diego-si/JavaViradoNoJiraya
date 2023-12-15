package academy.devdojo.maratonajava.javacore.lambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("AAA", "BBBB", "CCCC", "DDDD");
        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9);
        forEach(strings , s -> System.out.println(s));
        forEach(integers , i -> System.out.println(i));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }

    }
}
