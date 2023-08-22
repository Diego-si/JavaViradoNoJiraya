package academy.devdojo.maratonajava.introducao;

/**
 * Isso é um comentário <b>javadoc</b>
 */
public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041'; //unicode

        System.out.println("A idade é " + idade + " anos.");
        System.out.println("O caractere é " + caractere);
    }
}
