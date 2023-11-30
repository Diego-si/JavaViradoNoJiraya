package academy.devdojo.maratonajava.javacore.string.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "nome"; // String constant pool
        String nome2 = "nome2";
        nome = nome.concat(" sobre"); // nome += " sobre"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("nome2");
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
