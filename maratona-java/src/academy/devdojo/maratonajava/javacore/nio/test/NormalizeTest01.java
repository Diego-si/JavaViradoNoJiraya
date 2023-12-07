package academy.devdojo.maratonajava.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/digo/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path p1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());
        Path p2 = Paths.get("/home/./digo/./dev/");
        System.out.println(p2.normalize());
    }
}
