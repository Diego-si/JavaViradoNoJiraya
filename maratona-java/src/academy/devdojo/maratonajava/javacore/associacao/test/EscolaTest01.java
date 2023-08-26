package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professors ={professor, professor2};
        Escola escola = new Escola("Konoha", professors);

        escola.imprime();
    }
}
