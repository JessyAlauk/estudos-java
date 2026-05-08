package javacore.interfaces.test;

import javacore.interfaces.classes.Produto;

public class ProdutoTest {
    static void main() {
        Produto p = new Produto("Notebook", 4, 5000);
        p.calcularImposto();
        p.calcularFrete();
        System.out.println(p);
    }
}
