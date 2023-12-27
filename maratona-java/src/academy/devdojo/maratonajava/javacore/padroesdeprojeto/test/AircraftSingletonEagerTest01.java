package academy.devdojo.maratonajava.javacore.padroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio.Aircraft;
import academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
    }
    private static void bookSeat(String seat) {
        AircraftSingletonEager aircraftSingletonEager = AircraftSingletonEager.getInstance();
        System.out.println(aircraftSingletonEager.bookSeat(seat));
    }
}
