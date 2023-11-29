
package academy.devdojo.maratonajava.javacore.Exception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1,0);
    }

    /**
     *
     * @param a
     * @param b nao pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Não pode ser dividido por zero");
        }
        return a/b;
    }
}
