package academy.devdojo.maratonajava.javacore.modificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    public int[] getEpisodios() {
        return episodios;
    }

    // 0 - bloco de inicializxacao e executado quando a JVM carrega a classe
    // 1 - alocado em memoria pro objeto
    // 2 - cada atributo de classe e criado e inicializado com valores default ou o que for passado
    // 3 - bloco de inicializacao executado
    // 4 - constructor inicializado
    static {
        System.out.println("Dentro do bloco de inicializacao estatico 1");
        episodios = new int[1100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estatico 2");
    }

    {
        System.out.println("Dentro do bloco de inicializacao nao estatico 3");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio: Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }
}
