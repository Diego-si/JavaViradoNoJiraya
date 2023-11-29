
package academy.devdojo.maratonajava.javacore.Exception.runtime.test;

import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void talvezLanceException() throws SQLException, IOException {

    }
}
