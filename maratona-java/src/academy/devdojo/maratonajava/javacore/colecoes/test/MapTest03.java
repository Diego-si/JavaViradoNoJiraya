package academy.devdojo.maratonajava.javacore.colecoes.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.colecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Digo");
        Consumidor consumidor2 = new Consumidor("DevDojo");

        Manga hellsingUltimate = new Manga(4L, "Hellsing Ultimate", 3.2);
        Manga berserk = new Manga(1L, "Berserk", 9.5);
        Manga pokemon = new Manga(3L, "Pokemon", 11.20);
        Manga attackOnTitan = new Manga(5L, "Attack on titan", 19.9);
        Manga dragonBallZ = new Manga(2L, "Dragon ball Z", 2.99);

        List<Manga> mangaListConsumidor1 = List.of(hellsingUltimate, berserk, pokemon);
        List<Manga> mangaListConsumidor2 = List.of(attackOnTitan, dragonBallZ);
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaListConsumidor1);
        consumidorMangaMap.put(consumidor2, mangaListConsumidor2);

        for (Map.Entry<Consumidor, List<Manga>> entry: consumidorMangaMap.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Manga manga: entry.getValue()) {
                System.out.println("   " + manga.getNome());
            }
        }
    }
}
