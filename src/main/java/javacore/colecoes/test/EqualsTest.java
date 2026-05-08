package javacore.colecoes.test;

import javacore.colecoes.classes.Celular;

public class EqualsTest {
    static void main() {
        String nome1 = "A";
        String nome2 = "A";

        System.out.println(nome1.equalsIgnoreCase(nome2));

        Celular c1 = new Celular("iPhone", "1234");
        Celular c2 = new Celular("iPhone", "3214");

        System.out.println(c1.equals(c2));
    }
}
