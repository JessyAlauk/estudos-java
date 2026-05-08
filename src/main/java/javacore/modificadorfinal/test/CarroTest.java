package javacore.modificadorfinal.test;

import javacore.modificadorfinal.classes.Carro;

public class CarroTest {
    static void main() {
        Carro c = new Carro();
        System.out.println(c.getComprador());
        c.getComprador().setNome("Juquinha");
        System.out.println(c.getComprador());
    }
}
