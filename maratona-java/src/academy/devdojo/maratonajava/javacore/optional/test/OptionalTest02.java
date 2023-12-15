package academy.devdojo.maratonajava.javacore.optional.test;

import academy.devdojo.maratonajava.javacore.optional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.optional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> manByTitle = MangaRepository.finByTitle("Boku no Hero");
        manByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(manByTitle);
        System.out.println();

        Manga mangaById = MangaRepository.finById(2).orElseThrow(IllegalAccessError::new);
        System.out.println(mangaById);
        System.out.println();

        Manga newManga = MangaRepository.finByTitle("Drifiters")
                .orElseGet(() -> new Manga(3, "Drifiters", 20));
        System.out.println(newManga);
    }
}
