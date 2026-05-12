package javacore.generics.test;

import javacore.generics.classes.Carro;
import javacore.generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {
    static void main() {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("Porshe"));

        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);

        Carro carro = carroAlugavel.getObjetoDisponivel();

        System.out.println("Alugando o carro por um mes");

        carroAlugavel.devolverObjeto(carro);

        System.out.println("-----------------------------");

        List<Computador> computadoresDisponiveis = new ArrayList<>();

        computadoresDisponiveis.add(new Computador("Dell"));
        computadoresDisponiveis.add(new Computador("Mac"));

        ObjetosAlugaveis<Computador> computadorAlugavel = new ObjetosAlugaveis<>(computadoresDisponiveis);

        Computador computador = computadorAlugavel.getObjetoDisponivel();

        System.out.println("Alugando o computador por um mes");

        computadorAlugavel.devolverObjeto(computador);

    }
}
//type
class ObjetosAlugaveis<T> {
    private List<T> objetosDisponiveis = new ArrayList<>();
    public ObjetosAlugaveis (List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }
    public T getObjetoDisponivel(){
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponveis: " + objetosDisponiveis);
        return t;
    }
    public void devolverObjeto(T t){
        System.out.println("Devolvendo objeto: " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponveis: " + objetosDisponiveis);
    }
}
