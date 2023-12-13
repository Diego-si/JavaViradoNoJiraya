package academy.devdojo.maratonajava.javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatoes = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatoes);
        List<Animal> animals = new ArrayList<>();
        printCosultaAnimal(animals);
    }
    // Type erasure
    private static void printConsulta(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
    private static void printCosultaAnimal(List<? super Animal> animals) {
        animals.add(new Cachorro());
        animals.add(new Gato());
    }
}
