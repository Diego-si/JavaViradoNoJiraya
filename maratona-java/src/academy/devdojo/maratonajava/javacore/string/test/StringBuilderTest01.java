package academy.devdojo.maratonajava.javacore.string.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "nome";
        nome.concat(" dev");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Nome");
        sb.append(" dev");
        sb.delete(0,1);
        System.out.println(sb);
    }
}
