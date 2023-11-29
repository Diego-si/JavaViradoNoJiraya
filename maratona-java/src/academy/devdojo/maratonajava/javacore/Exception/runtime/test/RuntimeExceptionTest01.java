package academy.devdojo.maratonajava.javacore.Exception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // checked e unchecked
        Object object = null;
        System.out.println(object.toString());
        int[] num = {1,2};
        System.out.println(num[2]);
    }
}
