package javacore.colecoes.test;

import javacore.colecoes.classes.Produto;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
    static void main() {
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000, 0);
        Produto produto2 = new Produto("321", "Teclado Razer", 1000.55, 10);
        Produto produto3 = new Produto("213", "Monitor Dell", 700.5, 5);
        Produto produto4 = new Produto("465", "Celular Galaxy S24", 5000.24, 0);
        Produto produto5 = new Produto("000", "Celular Galaxy S25 plus", 10000.24, 0);
//        Set<Produto> produtoSet = new HashSet<>();
        Set<Produto> produtoSet = new LinkedHashSet<>();

        produtoSet.add(produto1);
        produtoSet.add(produto2);
        produtoSet.add(produto3);
        produtoSet.add(produto4);
        produtoSet.add(produto5);

        for (Produto p : produtoSet){
            System.out.println(p);
        }

    }
}
