package javacore.classesinternas.test;

public class ClassesLocaisTest {
    private String nome = "William";

    public void fazAlgumaCoisa(){
        String sobrenome = "Suane";
        class Interna{
            public void imprimeNomeExterno() {
                System.out.println(nome);
                System.out.println(sobrenome);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();
    }
    static void main() {
        ClassesLocaisTest externa = new ClassesLocaisTest();
        externa.fazAlgumaCoisa();
    }
}
