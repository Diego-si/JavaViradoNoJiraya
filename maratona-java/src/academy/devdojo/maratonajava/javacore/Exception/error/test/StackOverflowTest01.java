package academy.devdojo.maratonajava.javacore.Exception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {
        recursividade();
    }
}
