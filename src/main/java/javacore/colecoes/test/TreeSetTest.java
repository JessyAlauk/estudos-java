package javacore.colecoes.test;

import javacore.colecoes.classes.Celular;
import javacore.colecoes.classes.Produto;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

class CelularNomeComparator implements Comparator<Celular> {

    @Override
    public int compare(Celular o1, Celular o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class TreeSetTest {
    static void main() {
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000, 0);
        Produto produto2 = new Produto("321", "Teclado Razer", 1000.55, 10);
        Produto produto3 = new Produto("213", "Monitor Dell", 700.5, 5);
        Produto produto4 = new Produto("465", "Celular Galaxy S24", 5000.24, 0);
        Produto produto5 = new Produto("000", "Celular Galaxy S25 plus", 10000.24,1);
        Celular celular = new Celular("iPhone 17 pro max","132345");
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
        NavigableSet<Celular> celularNavigableSet = new TreeSet<>(new CelularNomeComparator());

        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.add(produto5);

        celularNavigableSet.add(celular);
        for (Celular celular1  : celularNavigableSet){
            System.out.println(celular1);
        }

        for (Produto produto : produtoNavigableSet){
            System.out.println(produto);
        }

        for (Produto produto : produtoNavigableSet.descendingSet()){ // lista do ultimo ao primeiro
            System.out.println(produto);
        }

        System.out.println("------------------------------");

        //lower <
        //floor <=
        //higher >
        //ceiling >=

        System.out.println(produtoNavigableSet.lower(produto3));
        System.out.println(produtoNavigableSet.floor(produto3));
        System.out.println(produtoNavigableSet.higher(produto3));
        System.out.println(produtoNavigableSet.ceiling(produto3));

        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollFirst()); // retorna e retira o primeiro da lista
        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollLast()); // retorna e retira o ultimo da lista
        System.out.println(produtoNavigableSet.size());

    }
}
