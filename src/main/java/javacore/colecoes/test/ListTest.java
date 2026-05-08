package javacore.colecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    static void main() {
        List<String> nomes = new ArrayList<>();
        List<String> sobrenomes = new ArrayList<>();
        List<Integer> numeros = new ArrayList<>();
        nomes.add("Jessica");
        nomes.add("Jose");
        nomes.add("Joao");
        nomes.add("Veltron");

        numeros.add(1);
        numeros.add(42);
        numeros.add(10);
        numeros.add(4);
        numeros.add(150);

        sobrenomes.add("Silva");
        sobrenomes.add("Souza");
        sobrenomes.add("Pereira");
        sobrenomes.add("Santos");

        System.out.println("Size: " + nomes.size());

        for (String nome : nomes){
            System.out.println(nome);
        }
        nomes.add("Suanne");
        nomes.remove("Jessica");
        nomes.clear();
        nomes.addAll(sobrenomes);
        System.out.println("Size: " + nomes.size());
        for (String nome : nomes){
            System.out.println(nome);
        }

        for (Integer numero : numeros){
            System.out.println(numero);

            if (numero == 10) {
                System.out.println("oPAAA");
            }
        }

        numeros.forEach(numero -> {
            System.out.println(numero);

            if (numero == 10) {
                System.out.println("oPAAA");
            }
        });
    }
}
