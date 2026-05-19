package javacore.comportamentoporparametro.predicate;

import javacore.comportamentoporparametro.classes.Carro;
import javacore.comportamentoporparametro.interfaces.CarroPredicate;

import java.util.Calendar;

public class CarrosDezAnosRecentepredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > Calendar.getInstance().get(Calendar.YEAR) - 10;
    }
}
