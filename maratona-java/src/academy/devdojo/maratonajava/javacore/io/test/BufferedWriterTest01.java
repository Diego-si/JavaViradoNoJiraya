package academy.devdojo.maratonajava.javacore.io.test;

import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fw)) {
            // BufferedWriter e mais rapido
            br.write("alo galera de callgilr aloooo");
            br.newLine(); // baseado no sistema operacional
            br.flush(); // fazer limpeza
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
