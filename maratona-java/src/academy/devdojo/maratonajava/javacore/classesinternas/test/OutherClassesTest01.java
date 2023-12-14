package academy.devdojo.maratonajava.javacore.classesinternas.test;

public class OutherClassesTest01 {
    private String name = "Monkey D. Lufyy";

    class  Inner {
        public void printOutherClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OutherClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        OutherClassesTest01 outherClass = new OutherClassesTest01();
        Inner inner = outherClass.new Inner();
        Inner inner2 = new OutherClassesTest01().new Inner();
        inner.printOutherClassAttribute();
        inner2.printOutherClassAttribute();
    }
}
