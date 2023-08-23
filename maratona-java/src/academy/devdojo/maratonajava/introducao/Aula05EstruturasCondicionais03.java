package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 600;
        String msgDoar = "Eu doar";
        String msgNaoDoar = "Eu não doar";
        // (condicao) ? verdadeiro : falso
        String resultado = salario > 500 ? msgDoar : msgNaoDoar;

        System.out.println(resultado);
    }
}
