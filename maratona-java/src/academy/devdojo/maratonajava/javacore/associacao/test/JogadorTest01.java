package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("A");
        Jogador jogador2 = new Jogador("B");
        Jogador jogador3 = new Jogador("C");

        Jogador[] jogadores = new Jogador[]{jogador1,jogador2,jogador3};

        for (Jogador jogadore : jogadores) {
            jogadore.imprime();
        }

    }
}
