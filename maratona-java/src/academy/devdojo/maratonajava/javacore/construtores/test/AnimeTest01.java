package academy.devdojo.maratonajava.javacore.construtores.test;

import academy.devdojo.maratonajava.javacore.construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One peace",1200, "TV", "ação, aventura, fantasia", "Toei Animation");
        anime.imprime();
    }
}
