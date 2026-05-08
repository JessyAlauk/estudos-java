package javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {
    static void main() {
        List<String> nomes = new ArrayList<>();
        nomes.add("Jessica");
        nomes.add("Santos");
        nomes.add("Alauk");
        nomes.add("Velton");
        nomes.add("Pereira");
        Collections.sort(nomes);

        List<Double> numeros = new ArrayList<>();
        numeros.add(1.5);
        numeros.add(2.6);
        numeros.add(10.0);
        numeros.add(5.5);
        numeros.add(3.3);

        Collections.sort(numeros);

        for (String nome : nomes){
            System.out.println(nome);
        }

        for (Double numero : numeros){
            System.out.println(numero);
        }

    }
}
