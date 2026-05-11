package javacore.colecoes.test;

import javacore.colecoes.classes.Consumidor;
import javacore.colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {
    static void main() {
        Consumidor consumidor = new Consumidor("William", "123");
        Consumidor consumidor2 = new Consumidor("DevDojo", "321");

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000);
        Produto produto2 = new Produto("321", "Teclado Razer", 1000.55);
        Produto produto3 = new Produto("213", "Monitor Dell", 700.5);
        Produto produto4 = new Produto("465", "Celular Galaxy S24", 5000.24);

        Map<Consumidor,Produto> map = new HashMap<>();

        map.put(consumidor, produto2);
        map.put(consumidor2, produto4);

        List<Produto> produtoCon1 = new ArrayList<>();

        produtoCon1.add(produto1);
        produtoCon1.add(produto2);

        List<Produto> produtoCon2 = new ArrayList<>();

        produtoCon2.add(produto3);
        produtoCon2.add(produto4);

        for(Map.Entry<Consumidor,Produto> entry : map.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }

        Map<Consumidor,List<Produto>> map2 = new HashMap<>();

        map2.put(consumidor,produtoCon1);
        map2.put(consumidor2,produtoCon2);

        for (Map.Entry<Consumidor,List<Produto>> entry : map2.entrySet()){
            System.out.println(entry.getKey().getNome());
            for (Produto produto : entry.getValue()){
                System.out.println(produto.getNome());
            }
        }
    }


}
