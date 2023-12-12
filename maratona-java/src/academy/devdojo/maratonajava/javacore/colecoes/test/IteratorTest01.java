package academy.devdojo.maratonajava.javacore.colecoes.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Manga;

import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L, "Attack on titan",19.9,0));
        mangas.add(new Manga(1L,"Berserk",9.5,5));
        mangas.add(new Manga(4L,"Hellsing Ultimate",3.2,0));
        mangas.add(new Manga(3L,"Pokemon",11.20,2));
        mangas.add(new Manga(2L,"Dragon ball Z",2.99,0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) {
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
