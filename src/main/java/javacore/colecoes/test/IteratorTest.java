package javacore.colecoes.test;

import javacore.colecoes.classes.Produto;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest {
    static void main() {
        List<Produto> produtos = new LinkedList<>();
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000, 0);
        Produto produto2 = new Produto("321", "Teclado Razer", 1000.55, 10);
        Produto produto3 = new Produto("213", "Monitor Dell", 700.5, 5);
        Produto produto4 = new Produto("465", "Celular Galaxy S24", 5000.24, 0);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        System.out.println(produtos.size());
        System.out.println(produtos);

        Iterator<Produto> produtoIterator = produtos.iterator();
        //hasNext() next();
        while(produtoIterator.hasNext()){
            if (produtoIterator.next().getQuantidade() == 0){
                produtoIterator.remove();
            }
        }
        //novo produtos.removeIf(produto -> produto.getQuantidade() == 0);
        System.out.println(produtos.size());
        System.out.println(produtos);
    }
}
