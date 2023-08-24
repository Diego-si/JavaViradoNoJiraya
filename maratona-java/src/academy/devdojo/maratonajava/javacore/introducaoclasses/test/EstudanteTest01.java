package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "estudante";
        estudante.idade = 15;
        estudante.sexo = 'M';

        System.out.println(estudante.idade);
    }
}
