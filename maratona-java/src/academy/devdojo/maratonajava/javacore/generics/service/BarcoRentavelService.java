package academy.devdojo.maratonajava.javacore.generics.service;

import academy.devdojo.maratonajava.javacore.generics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponíveis = new ArrayList<>(
            List.of(new Barco("Lancha"),
                    new Barco("Canoa"))
    );

    public Barco buscarBarcoDisponivel() {
        System.out.println("Buscando Barco disponivel.....");
        Barco barco = barcosDisponíveis.remove(0);
        System.out.println("Alugando Barco: " + barco);
        System.out.println("Barcos disponíveis para alugar: ");
        System.out.println(barcosDisponíveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo Barco " + barco);
        barcosDisponíveis.add(barco);
        System.out.println("Barcos disponpiveis para alugar: ");
        System.out.println(barcosDisponíveis);
    }
}
