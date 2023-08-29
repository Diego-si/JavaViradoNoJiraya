package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua A");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba branca", "Pirata");
        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("One piece", alunos, local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);

        professor.impreme();
    }
}
