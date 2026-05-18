package javacore.padroesdeprojeto.test;

import javacore.padroesdeprojeto.classes.Moeda;
import javacore.padroesdeprojeto.classes.MoedaFactory;
import javacore.padroesdeprojeto.classes.Pais;

public class MoedaFactoryTest {
    static void main() {
        Moeda moeda = MoedaFactory.criarMoeda(Pais.BRASIL);
        System.out.println(moeda.getSimbolo());
    }
}
