package javacore.colecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversaodeListasArraysTest {

    static void main() {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(4);
        numeros.add(1);
        numeros.add(5);
        numeros.add(7);
        numeros.add(9);
        Integer[] numerosArray = new Integer[numeros.size()];
        numeros.toArray(numerosArray);

        System.out.println(numeros);
        System.out.println(Arrays.toString(numerosArray));

        Integer[] numerosArray2 = new Integer[4];
        numerosArray2[0] = 2;
        numerosArray2[1] = 0;
        numerosArray2[2] = 4;
        numerosArray2[3] = 4;

        List<Integer> numeros2 = Arrays.asList(numerosArray2);

        System.out.println(Arrays.toString(numerosArray2));
        System.out.println(numeros2);
        //numeros2 e numerosArray2 estao unidos, se mexe um altera o outro igual

        List<Integer> numeros3 = new ArrayList<>();
        numeros3.addAll(Arrays.asList(numerosArray2));

        System.out.println(numeros3);

        //numeros3 nao tem ligação com numerosArray2, por isso pode ser alterado de forma livre
    }
}
