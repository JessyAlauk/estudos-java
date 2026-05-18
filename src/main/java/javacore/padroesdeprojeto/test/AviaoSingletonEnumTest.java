package javacore.padroesdeprojeto.test;

import javacore.padroesdeprojeto.classes.AviaoSingletonEnum;

public class AviaoSingletonEnumTest {
    static void main() {
        AviaoSingletonEnum.agendarAssento("1A");
        AviaoSingletonEnum.agendarAssento("1A");
    }
}
