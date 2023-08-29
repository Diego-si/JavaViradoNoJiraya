package academy.devdojo.maratonajava.javacore.classeabstratas.test;

import academy.devdojo.maratonajava.javacore.classeabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.classeabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.classeabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 2000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Zoro", 5000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();

    }
}
