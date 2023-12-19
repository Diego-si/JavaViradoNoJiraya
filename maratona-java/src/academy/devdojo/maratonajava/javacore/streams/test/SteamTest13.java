package academy.devdojo.maratonajava.javacore.streams.test;

import academy.devdojo.maratonajava.javacore.streams.dominio.Category;
import academy.devdojo.maratonajava.javacore.streams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.streams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static academy.devdojo.maratonajava.javacore.streams.dominio.Promotion.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.streams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;

public class SteamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));
    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(groupingBy(SteamTest13::getPromotion));

        System.out.println(collect);

        // Map<Category, Map<Promotion, List<LightNovel>>>
        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels
                .stream()
                .collect(groupingBy(LightNovel::getCategory,
                        groupingBy(SteamTest13::getPromotion
                        )));

        System.out.println(collect1);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
