package javacore.comportamentoporparametro.interfaces;

import javacore.comportamentoporparametro.classes.Carro;

public interface CarroPredicate {
    boolean test(Carro carro);
}
