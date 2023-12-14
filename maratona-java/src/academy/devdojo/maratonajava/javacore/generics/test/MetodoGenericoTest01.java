package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
//        criarArrayComUmObjeto(new Barco("canoa Marota"));
        List<Barco> barcoList = criarArrayObjeto(new Barco("canoa Marota"));
        System.out.println(barcoList);
    }
    private static <T> void criarArrayComUmObjeto(T t) {
        List<T> list = List.of(t);
        System.out.println(list);
    }

    private static <T> List<T> criarArrayObjeto(T t) {
        return List.of(t);
    }
}