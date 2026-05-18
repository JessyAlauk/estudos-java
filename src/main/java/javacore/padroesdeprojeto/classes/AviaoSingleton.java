package javacore.padroesdeprojeto.classes;

import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {
    //eager initialization
//    private static final AviaoSingleton INSTANCE = new AviaoSingleton();
    // lazy initialization
    private static AviaoSingleton INSTANCE = new AviaoSingleton();
    private Set<String> assentosDisponiveis;


    private AviaoSingleton() {
        this.assentosDisponiveis = new HashSet<>();
        assentosDisponiveis.add("1A");
        assentosDisponiveis.add("1B");
    }

    public static AviaoSingleton getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AviaoSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AviaoSingleton();
                }
            }
        }
        return INSTANCE;
    }

    public boolean bookAssento(String assento) {
        return assentosDisponiveis.remove(assento);
    }

}
