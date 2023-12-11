package academy.devdojo.maratonajava.javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
//        List nomes = new ArrayList(); // 1.4
        List<String> nomes = new ArrayList<>(16); // 1.5
        List<String> nomes2 = new ArrayList<>(16); // 1.5
        nomes.add("Digo");
        nomes.add("DevDojo Academy");
        nomes2.add("aaaa");
        nomes2.add("bbbb");
//        System.out.println(nomes.remove("digo"));

        nomes.addAll(nomes2);

        for (String nome: nomes) {
            System.out.println(nome);
        }

        System.out.println("---");
        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        System.out.println(numeros);
    }
}
