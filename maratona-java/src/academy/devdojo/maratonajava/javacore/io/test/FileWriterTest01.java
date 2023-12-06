package academy.devdojo.maratonajava.javacore.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        // append true para nao sobescrever
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("alo galera de callgilr aloooo");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
