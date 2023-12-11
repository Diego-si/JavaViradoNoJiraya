package academy.devdojo.maratonajava.javacore.colecoes.test;

import academy.devdojo.maratonajava.javacore.colecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {

        Smartphone s1 = new Smartphone("1ABC1", "iphone");
        Smartphone s2 = new Smartphone("22222", "Pixel");
        Smartphone s3 = new Smartphone("33333", "Samsung");
        Smartphone s4 = new Smartphone("44444", "Xiaomi");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);
        smartphones.add(s4);

//        smartphones.clear(); // limpa tudo
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }
        Smartphone s5 = new Smartphone("22222", "Pixel");

        System.out.println(smartphones.contains(s5));
        int indexSmartphone4 = smartphones.indexOf(s5);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
