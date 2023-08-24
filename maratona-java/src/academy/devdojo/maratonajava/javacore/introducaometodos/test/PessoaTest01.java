package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("jiraya");
        pessoa.setIdade(15);

//        pessoa.imprime();

        System.out.println(pessoa.getNome());
    }
}
