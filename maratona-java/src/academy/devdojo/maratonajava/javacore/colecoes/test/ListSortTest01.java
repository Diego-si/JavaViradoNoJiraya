package academy.devdojo.maratonajava.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(101.10);
        dinheiros.add(10.10);
        dinheiros.add(85.10);
        dinheiros.add(65.10);

        Collections.sort(dinheiros);

        for (String manga: mangas) {
            System.out.println(manga);
        }

        System.out.println(dinheiros);
    }
}
