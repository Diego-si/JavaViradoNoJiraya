package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Kami";
        carro.modelo = "model";
        carro.ano = 1200;

        //referencia de objetos
        carro = carro2;

        carro2.nome = "CAR";
        carro2.modelo = "novo";
        carro2.ano = 5200;

        System.out.println("Carro: " + carro.nome +
                " Ano: " + carro.ano +
                " Modelo: " + carro.modelo);

        System.out.println("\nCarro: " + carro2.nome +
                " Ano: " + carro2.ano +
                " Modelo: " + carro2.modelo);

    }
}
