package academy.devdojo.maratonajava.javacore.heranca.test;

import academy.devdojo.maratonajava.javacore.heranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.heranca.dominio.Pessoa;

public class HerancaTest02 {
    // 0 - bloco de inicializxacao estático da super classe e executado quando a JVM carrega a classe pai
    // 1 - bloco de inicializxacao estático da sub classe e executado quando a JVM carrega a classe filha
    // 2 - alocado em memoria pro objeto da superclasse
    // 3 - cada atributo de superclasse e criado e inicializado com valores default ou o que for passado
    // 4 - bloco de inicializacao da superclasse é executado na ordem em que aparece
    // 5 - constructor inicializado da superclasse
    // 6 - alocado em memoria pro objeto da subclasse
    // 7 - cada atributo de subclasse e criado e inicializado com valores default ou o que for passado
    // 8 - bloco de inicializacao da subclasse é executado na ordem em que aparece
    // 9 - constructor inicializado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Funcionario A");

    }
}
