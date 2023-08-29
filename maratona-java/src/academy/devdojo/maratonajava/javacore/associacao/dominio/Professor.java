package academy.devdojo.maratonajava.javacore.associacao.dominio;

public class Professor {
    private String nome;
    private String especialista;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialista) {
        this.nome = nome;
        this.especialista = especialista;
    }

    public Professor(String nome, String especialista, Seminario[] seminarios) {
        this.nome = nome;
        this.especialista = especialista;
        this.seminarios = seminarios;
    }

    public void impreme() {
        System.out.println("-----------");
        System.out.println("Professor: "+this.nome);
        if (this.seminarios == null) return;
        System.out.println("## Seminários cadastrados ##");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("** Alunos **");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: "+ aluno.getNome() + " Idade: "+ aluno.getIdade());
            }

        }

    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
