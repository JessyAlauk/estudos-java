package javacore.generics.test;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest {
    static void main() {
        criarArray(new Cachorro());
    }

    public static <T extends Animal> void criarArray(T t){
        List<T> lista = new ArrayList<>();
        lista.add(t);
        System.out.println(lista);
    }
}
