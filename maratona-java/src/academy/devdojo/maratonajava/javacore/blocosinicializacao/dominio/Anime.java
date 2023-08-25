package academy.devdojo.maratonajava.javacore.blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    public int[] getEpisodios() {
        return episodios;
    }

    // 1 - alocado em memoria pro objeto
    // 2 - cada atributo de classe e criado e inicializado com valores default ou o que for passado
    // 3 - bloco de inicializacao executado
    // 4 - constructor inicializado
    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[1100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
}
