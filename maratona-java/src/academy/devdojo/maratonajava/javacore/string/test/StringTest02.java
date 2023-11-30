package academy.devdojo.maratonajava.javacore.string.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "  Luffy";
        String num = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(num.length());
        System.out.println(num.substring(3, num.length()));
        System.out.println(nome.trim());
    }
}
