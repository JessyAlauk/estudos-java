package javacore.colecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest {
    static void main() {
//        Map<String,String> map = new HashMap<>(); // nao garante ordem de inserção
        Map<String,String> map = new LinkedHashMap<>(); // garante ordem de inserção

        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("meza", "mesa");

        for (String key : map.keySet()){
            System.out.println(key);
        }

        for (String key : map.values()){
            System.out.println(key);
        }

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - "  + entry.getValue());
        }
    }
}
