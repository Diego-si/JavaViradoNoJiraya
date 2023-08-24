package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Calculadora;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String... args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Sanji";
        funcionario.idade = 55;
        funcionario.salario = new double[]{1200,500,4000};

        funcionario.imprimir();

    }
}
