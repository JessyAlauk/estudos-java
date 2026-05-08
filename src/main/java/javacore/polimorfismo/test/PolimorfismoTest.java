package javacore.polimorfismo.test;

import javacore.polimorfismo.classes.Gerente;
import javacore.polimorfismo.classes.RelatorioPagamento;
import javacore.polimorfismo.classes.Vendedor;

public class PolimorfismoTest {
    static void main() {
        Gerente g = new Gerente("Jose da Silva", 10000, 2000);
        Vendedor v = new Vendedor("Joao Souza", 5000, 100000);

        RelatorioPagamento relatorio = new RelatorioPagamento();
        relatorio.relatorioPagamentoGenerico(g);
        relatorio.relatorioPagamentoGenerico(v);

    }
}
