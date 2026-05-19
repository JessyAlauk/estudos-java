package javacore.comportamentoporparametro.predicate;

import javacore.comportamentoporparametro.classes.Carro;
import javacore.comportamentoporparametro.interfaces.CarroPredicate;

public class CarrosCorVerdepredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equalsIgnoreCase("verde");
    }
}
