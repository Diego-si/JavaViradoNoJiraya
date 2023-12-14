package academy.devdojo.maratonajava.javacore.classesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Lufyy";

    class  Inner {
        public void printOutherClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outherClass = new OuterClassesTest01();
        Inner inner = outherClass.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOutherClassAttribute();
        inner2.printOutherClassAttribute();
    }
}
