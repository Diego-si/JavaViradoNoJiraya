package academy.devdojo.maratonajava.javacore.streams.test;

import academy.devdojo.maratonajava.javacore.streams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class SteamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Aaaaaa aaaaa", "bbbbb bbbbb", "cccccc ccccc");
        List<String> developers = List.of("Will", "David", "hari");
        List<String> students = List.of("Edi", "gu", "Gui");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println();
        devdojo.stream().flatMap(Collection::stream).forEach(System.out::println);
    }
}
