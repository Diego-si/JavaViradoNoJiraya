package academy.devdojo.maratonajava.javacore.serializacao.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {
    private Long id;
    private String nome;
    private transient String password;
    private static final String NOME_ESCOLA = "DevDojo Viradão no Jiraya";
    private transient Turma turma; // transient para nao serializar
    // para serializa um objeto que nao e serializado
    // precisa escrever ObjectOutputStream todos os atributos e depois ler ObjectInputStream

    public Aluno(Long id, String nome, String password) {
        System.out.println("Dentro do constructor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    private void writeObject(ObjectOutputStream oos) {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void readObject(ObjectInputStream ois) {
        try {
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
                ", Turma='" + turma + '\'' +
                '}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
