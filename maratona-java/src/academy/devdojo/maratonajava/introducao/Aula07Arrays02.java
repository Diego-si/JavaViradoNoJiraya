package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, inte, long, float e double == 0
        // char '\u0000' == ' '
        // boolean == false
        // String == null

        String[] nomes = new String[4];
        nomes[0] = "pessoa";
        nomes[1] = "ola";
        nomes[2] = "viva";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
