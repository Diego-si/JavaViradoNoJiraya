package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Kami";
        professor.idade = 12;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome +
                " idade: " + professor.idade +
                " sexo: " + professor.sexo);

    }
}
