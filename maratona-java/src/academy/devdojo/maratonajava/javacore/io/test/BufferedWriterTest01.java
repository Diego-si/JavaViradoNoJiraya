package academy.devdojo.maratonajava.javacore.io.test;

import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            // BufferedWriter e mais rapido
            bw.write("alo galera de callgilr aloooo");
            bw.newLine(); // baseado no sistema operacional
            bw.flush(); // fazer limpeza
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
