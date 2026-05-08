package javacore.colecoes.test;

import javacore.colecoes.classes.Produto;

import java.util.*;

class ProdutoNomeComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class SortProdutoTest {
    static void main() {
        List<Produto> produtos = new ArrayList<>();
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000);
        Produto produto2 = new Produto("321", "Teclado Razer", 1000.55);
        Produto produto3 = new Produto("213", "Monitor Dell", 700.5);
        Produto produto4 = new Produto("465", "Celular Galaxy S24", 5000.24);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        Collections.sort(produtos, new ProdutoNomeComparator());

        Produto[] produtosArray = new Produto[4];
        produtosArray[0] = produto1;
        produtosArray[1] = produto2;
        produtosArray[2] = produto3;
        produtosArray[3] = produto4;

        Arrays.sort(produtosArray);
        Arrays.toString(produtosArray);

        for (Produto produto : produtos){
            System.out.println(produto);
        }
    }
}
