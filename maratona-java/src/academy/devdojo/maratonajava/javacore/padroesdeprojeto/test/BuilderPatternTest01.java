package academy.devdojo.maratonajava.javacore.padroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Digo")
                .lastName("Si")
                .userName("viradonojiraya")
                .email("email")
                .build();
        System.out.println(build);
    }
}
