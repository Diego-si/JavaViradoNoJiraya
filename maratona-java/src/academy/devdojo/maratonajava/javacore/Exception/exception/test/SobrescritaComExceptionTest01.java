package academy.devdojo.maratonajava.javacore.Exception.exception.test;

import academy.devdojo.maratonajava.javacore.Exception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Exception.exception.dominio.LoginInvalidoException;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args)  {
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
