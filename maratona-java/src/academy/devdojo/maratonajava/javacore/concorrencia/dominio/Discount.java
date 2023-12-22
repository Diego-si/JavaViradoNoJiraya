package academy.devdojo.maratonajava.javacore.concorrencia.dominio;

public class Discount {
    public enum Code {
        NONE(0), SUPER_UM(5), SUPER_DOIS(10),SUPER_SAYAJIN(15);
        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
