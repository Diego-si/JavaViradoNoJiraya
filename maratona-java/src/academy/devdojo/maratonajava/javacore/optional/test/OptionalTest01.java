package academy.devdojo.maratonajava.javacore.optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("AHa uhu o DevDojo é foda.");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println();

        Optional<String> name = findName("DevDojo");
        String empty = name.orElse("EMPTY");
        System.out.println(empty);
        name.ifPresent(s -> System.out.println(s.toUpperCase()));
    }
    private static Optional<String> findName(String name) {
        List<String> list = List.of("AAAA", "DevDojo");
        int i = list.indexOf(name);
        if (i != -1) {
            return Optional.of(list.get(i));
        }
        return Optional.empty();
    }
}
