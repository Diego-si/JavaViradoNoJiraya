package academy.devdojo.maratonajava.javacore.io.test;

import java.io.*;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file)) {
//            char[] in = new char[1];
//            fr.read(in);
//            for (char c :in) {
//                System.out.println(c);
//            }
            int i;
            while ((i = fr.read()) != -1){
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
