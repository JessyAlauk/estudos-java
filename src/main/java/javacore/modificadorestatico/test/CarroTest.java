package javacore.modificadorestatico.test;

import javacore.modificadorestatico.classes.Carro;

public class CarroTest {
    static void main() {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Audi", 275);
        Carro c3 = new Carro("Mercedes", 290);

        Carro.setVelocidadeLimite(220);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
