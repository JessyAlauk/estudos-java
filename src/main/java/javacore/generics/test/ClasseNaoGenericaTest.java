package javacore.generics.test;

import javacore.generics.classes.Carro;
import javacore.generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericaTest {
    static void main() {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o carro por um mes");
        carroAlugavel.devolverCarro(carroAlugado);

        System.out.println("========================");

        ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
        Computador computador = computadorAlugavel.getComputadorDisponivel();
        System.out.println("Usando o PC");
        computadorAlugavel.devolverComputador(computador);
    }
}

class CarroAlugavel {
    private List<Carro> carrosDisponiveis = new ArrayList<>();
    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("Porshe"));
    }
    public Carro getCarroDisponivel(){
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + c);
        System.out.println("Carros disponveis: " + carrosDisponiveis);
        return c;
    }
    public void devolverCarro(Carro c){
        System.out.println("Devolvendo carro: " + c);
        carrosDisponiveis.add(c);
        System.out.println("Carros disponveis: " + carrosDisponiveis);
    }
}

class ComputadorAlugavel {
    private List<Computador> computadoresDisponiveis = new ArrayList<>();
    {
        computadoresDisponiveis.add(new Computador("Dell"));
        computadoresDisponiveis.add(new Computador("Mac"));
    }
    public Computador getComputadorDisponivel(){
        Computador c = computadoresDisponiveis.remove(0);
        System.out.println("Alugando computador: " + c);
        System.out.println("Computadores disponveis: " + computadoresDisponiveis);
        return c;
    }
    public void devolverComputador(Computador c){
        System.out.println("Devolvendo computador: " + c);
        computadoresDisponiveis.add(c);
        System.out.println("Computadores disponveis: " + computadoresDisponiveis);
    }
}