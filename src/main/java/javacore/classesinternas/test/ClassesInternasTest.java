package javacore.classesinternas.test;

public class ClassesInternasTest {

    private String nome = "William jedi";

    private class Interna{
        public void verClasseExterna() {
            System.out.println(nome);
            System.out.println(this);
            System.out.println(ClassesInternasTest.this);
        }
    }

    static void main() {
        ClassesInternasTest externa = new ClassesInternasTest();
        ClassesInternasTest.Interna in = externa.new Interna();
        ClassesInternasTest.Interna in2 = new ClassesInternasTest().new Interna();
        in.verClasseExterna();
        in2.verClasseExterna();
    }
}
