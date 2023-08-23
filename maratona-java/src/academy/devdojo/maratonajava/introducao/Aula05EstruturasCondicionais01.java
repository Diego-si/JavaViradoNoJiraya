package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isTru = idade >= 18;

        if(isTru) {
            System.out.println("oi");
        }
        // !
        if(!isTru) {
            System.out.println("Não oi");
        }

        if(isTru) {
            System.out.println("true");
        } else {
            System.out.println("falso");
        }
    }
}
