package academy.devdojo.maratonajava.javacore.Exception.exception.dominio;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        System.out.println("salvando pessoa");
    }
}
