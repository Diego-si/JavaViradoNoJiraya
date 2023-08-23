package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int num01 = 10;
        int num02 = 20;
        int result = num01 + num02;
        System.out.println(result);

        // %
        int resto = 21 % 7;

        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgauDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10.0;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);

        // && (AND) || (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("Maior Que Trinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("Menor Que Trinta " + isDentroDaLeiMenorQueTrinta);

        double valorCorrente = 200;
        double valorPoupanca = 10000;
        float ps = 5000F;

        boolean isPs = valorCorrente > ps || valorPoupanca > ps;

        System.out.println("Pode comprar PS ? " + isPs);

        // = += -+ *+ /+ %=
        double bonus = 1800;
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; //3600
        bonus /= 2; //1800
        bonus %= 2; //0.0

        System.out.println("Bonus " + bonus);

        // ++ --
        int contador = 0;
        contador++;
        contador--; // incrementa depois
        --contador; // incrementa antes
        System.out.println("Contador " + contador);

    }
}
