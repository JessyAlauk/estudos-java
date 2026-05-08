package javacore.abstratas.test;

import javacore.abstratas.classes.Gerente;
import javacore.abstratas.classes.Vendedor;

public class FuncionarioTest {
    static void main() {
        Gerente g = new Gerente("Ana", "0002", 5000);
        Vendedor v = new Vendedor("Camila", "0003", 1500, 10000);
        g.calculaSalario();
        v.calculaSalario();
        System.out.println(g);
        System.out.println(v);
    }
}
