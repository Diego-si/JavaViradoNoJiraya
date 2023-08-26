package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Escola {
    private String nome;
    private Professor[] professor;

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessor() {
        return professor;
    }

    public void setProfessor(Professor[] professor) {
        this.professor = professor;
    }

    public void imprime() {
        System.out.println(this.nome);
        if(professor == null) return;
        for (Professor professores : professor) {
            System.out.println(professores.getNome());
        }
    }
}
