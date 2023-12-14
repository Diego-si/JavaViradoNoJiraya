package academy.devdojo.maratonajava.javacore.generics.test;

import academy.devdojo.maratonajava.javacore.generics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.generics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.generics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.generics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(
                List.of(new Carro("BMW"),
                        new Carro("Fusca"))
        );
        List<Barco> barcosDisponíveis = new ArrayList<>(
                List.of(new Barco("Lancha"),
                        new Barco("Canoa"))
        );
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("----------");

        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponíveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
