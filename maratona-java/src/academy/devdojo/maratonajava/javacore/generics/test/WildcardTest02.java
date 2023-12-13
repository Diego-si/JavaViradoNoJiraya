package academy.devdojo.maratonajava.javacore.generics.test;

import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatoes = List.of(new Gato(), new Gato());
    }
    // Type erasure
    private static void printConsulta(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
        animals.add(new Cachorro());
    }
}
