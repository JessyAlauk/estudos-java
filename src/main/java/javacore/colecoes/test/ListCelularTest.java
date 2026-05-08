package javacore.colecoes.test;

import javacore.colecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {
    static void main() {
        Celular celular1 = new Celular("Galaxy S24 plus","1344978641");
        Celular celular2 = new Celular("Galaxy S25 ultra","3121678464");
        Celular celular3 = new Celular("iPhone 17 pro max","4861858465");

        List<Celular> celulares = new ArrayList<>();

        celulares.add(celular1);
        celulares.add(celular2);
        celulares.add(celular3);

        for (Celular celular : celulares){
            System.out.println(celular);
        }
        Celular celular4 = new Celular("iPhone 17 pro max","4861858465");
        System.out.println(celular2.equals(celular4));
        System.out.println(celulares.contains(celular4));
    }
}
