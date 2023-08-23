package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] num = {1,2,3,4,5};

//        for (int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);
//        }
        for(int numer: num) {
            System.out.println(numer);
        }
    }
}
