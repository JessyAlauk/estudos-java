package javacore.colecoes.test;

import javacore.colecoes.classes.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapTest {
    static void main() {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Letra A");
        map.put("C", "Letra C");
        map.put("E", "Letra E");
        map.put("B", "Letra B");
        map.put("D", "Letra D");

        for (Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        Consumidor consumidor = new Consumidor("William", "123");
        Consumidor consumidor2 = new Consumidor("DevDojo", "321");

        NavigableMap<String, Consumidor> map2 = new TreeMap<>();
        map2.put("D", consumidor);
        map2.put("A", consumidor2);

        for (Map.Entry<String,Consumidor> entry : map2.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println(map.headMap("C")); //retorna valor menores do que o passado, se so passar o valor ele exclui, se passar true ele inclui
        System.out.println(map.ceilingEntry("C"));
        System.out.println(map.higherEntry("C"));
        System.out.println(map.floorEntry("C"));
        System.out.println(map.lowerEntry("C"));

        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        System.out.println(map.floorKey("C"));
        System.out.println(map.lowerKey("C"));

    }
}
