package javacore.colecoes.test;

import javacore.colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {
    static void main() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(1);
        numeros.add(5);
        numeros.add(7);
        numeros.add(9);
        //(-(ponto de inserção) -1)
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros,6));

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
        Produto produto5 = new Produto("000", "Antena parabolica", 3250.5);
        for (Produto produto : produtos ){
            System.out.println(produto);
        }

        System.out.println(Collections.binarySearch(produtos,produto5, new ProdutoNomeComparator()));

        Integer[] arrayInteger = new Integer[4];
        arrayInteger[0] = 2;
        arrayInteger[1] = 0;
        arrayInteger[2] = 4;
        arrayInteger[3] = 4;
        Arrays.sort(arrayInteger);
        System.out.println(Arrays.binarySearch(arrayInteger,1));
    }
}
