package javacore.padroesdeprojeto.test;

import javacore.padroesdeprojeto.classes.Aviao;

public class AviaoTest {
    static void main() {
        agendarAssento("1A");
        agendarAssento("1A");
    }

    private static void agendarAssento(String assento) {
        Aviao a = new Aviao();
        System.out.println(a.bookAssento(assento));
    }
}
