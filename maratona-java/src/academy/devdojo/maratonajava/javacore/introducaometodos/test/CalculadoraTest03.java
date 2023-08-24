package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultant = calculadora.divideDoisNumeros(20,2);
        System.out.println("Finalizando Divisao: " + resultant);

        double resultant1 = calculadora.divideDoisNumeros02(20,2);
        System.out.println("Finalizando Divisao 2: " + resultant1);

        calculadora.imprimiDivideDoisNumeros(20,2);
    }
}
