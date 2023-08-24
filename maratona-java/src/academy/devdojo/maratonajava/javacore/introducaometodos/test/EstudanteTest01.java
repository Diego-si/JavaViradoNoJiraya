package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.ImpressoaEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoaEstudante impressoa = new ImpressoaEstudante();

        estudante01.nome = "Midori";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 50;
        estudante02.sexo = 'M';

        impressoa.imprime(estudante01);
        impressoa.imprime(estudante02);
    }
}
