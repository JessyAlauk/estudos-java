package javacore.generics.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal implements Comparable{

    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Gato extends Animal{
    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}
public class WildCardTest {
    static void main() {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};

        consultarAnimais(cachorros);
        consultarAnimais(gatos);

        List<Cachorro> cachorroList = new ArrayList<>();
        cachorroList.add(new Cachorro());

        List<Gato> gatoList = new ArrayList<>();
        gatoList.add(new Gato());
        consultarAnimaisList(cachorroList);
        consultarAnimaisList(gatoList);
        ordenarLista(cachorroList);

    }

    public static void consultarAnimais(Animal[] animals){
        for (Animal animal : animals){
            animal.consulta();
        }
//        animals[1] = new Gato();
    }
    // type erasure | ?
    //aceita tudo que esteja abaixo de Animal
    public static void consultarAnimaisList (List<? extends Animal> animals){
        for (Animal animal : animals){
            animal.consulta();
        }
    }
    //Aceita cachorro ou a superclassse
    public static void consultarcachorrosList(List<? super Cachorro> cachorroList){
        cachorroList.add(new Cachorro());
        Animal c2 = new Cachorro();
    }

    public static void ordenarLista(List<? extends Comparable> lista){
        Collections.sort(lista);
    }
}
