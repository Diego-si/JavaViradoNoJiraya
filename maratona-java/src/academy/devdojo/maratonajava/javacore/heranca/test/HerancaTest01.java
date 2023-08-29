package academy.devdojo.maratonajava.javacore.heranca.test;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua A");
        endereco.setCep("12345-123");
        Pessoa pessoa = new Pessoa("Jurema");
        pessoa.setCpf("123");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("---------");

        Funcionario funcionario = new Funcionario("Funcionario A");
        funcionario.setSalario(12.12);
        funcionario.setCpf("321");
        funcionario.setEndereco(endereco);
        funcionario.imprime();
    }
}
