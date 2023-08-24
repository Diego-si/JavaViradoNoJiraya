package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null) {
            return;
        }
        for (double salarios: this.salario) {
            System.out.print(salarios + " ");
        }
        this.mediaSalario();
    }

    public void mediaSalario() {
        if (salario == null) {
            return;
        }
        double media = 0;
        for (double salarios: salario) {
            media += salarios;
        }
        media /= salario.length;
        System.out.println("\nMédia salarial: " + media);
    }


}
