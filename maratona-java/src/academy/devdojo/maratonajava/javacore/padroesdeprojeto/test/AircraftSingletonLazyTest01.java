package academy.devdojo.maratonajava.javacore.padroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.padroesdeprojeto.dominio.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonLazy.getInstance());
        Constructor<AircraftSingletonLazy> declaredConstructor = AircraftSingletonLazy.class.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        AircraftSingletonLazy aircraftSingletonLazy = declaredConstructor.newInstance("787-900");
        System.out.println(aircraftSingletonLazy);
    }
    private static void bookSeat(String seat) {
        System.out.println(AircraftSingletonLazy.getInstance());
        AircraftSingletonLazy aircraftSingletonLazy = AircraftSingletonLazy.getInstance();
        System.out.println(aircraftSingletonLazy.bookSeat(seat));
    }
}
