package academy.devdojo.maratonajava.javacore.lambdas.test;

import academy.devdojo.maratonajava.javacore.lambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.lambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
// reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 5), new Anime("One piece", 900), new Anime("Naruto", 500)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        animeList.sort((a1,a2) -> animeComparators.compareByEpisodesNonStatic(a1,a2));
        System.out.println(animeList);
    }
}
