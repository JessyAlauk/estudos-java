package javacore.comportamentoporparametro.test;

import javacore.comportamentoporparametro.classes.Carro;
import javacore.comportamentoporparametro.interfaces.CarroPredicate;
import javacore.comportamentoporparametro.predicate.CarrosCorVerdepredicate;
import javacore.comportamentoporparametro.predicate.CarrosDezAnosRecentepredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class Carrotest {
    private static List<Carro> filtrarCarroPorCor(List<Carro> carros, String cor) {
        List<Carro> result = new ArrayList<>();

        for (Carro carro : carros){
            if(carro.getCor().equalsIgnoreCase(cor)){
                result.add(carro);
            }
        }
        return result;
    }

    public static List<Carro> filtrarCarros(List<Carro> carros, CarroPredicate carroPredicate){
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carroPredicate.test(carro)){
                result.add(carro);
            }
        }
        return result;
    }

    public static <T> List<T> filtrar(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<>();
        for(T e : list){
            if (predicate.test(e)){
                result.add(e);
            }
        }
        return result;
    }

    static void main() {
        List<Carro> carros = asList(new Carro("Verde", 2011)
                , new Carro("Amarelo", 2013)
                , new Carro("Azul", 2017));

        List<Integer> numeros = asList(1,2,3,4,5,6,7,8,9);

        System.out.println(filtrarCarroPorCor(carros, "vermelho"));
        System.out.println(filtrarCarroPorCor(carros, "Azul"));
        System.out.println(filtrarCarroPorCor(carros, "Verde"));
        System.out.println(filtrarCarros(carros, new CarrosCorVerdepredicate()));
        System.out.println(filtrarCarros(carros, new CarrosDezAnosRecentepredicate()));
        System.out.println(filtrarCarros(carros,
                carro -> carro.getCor().equalsIgnoreCase("verde")));
        System.out.println(filtrar(carros,
                carro -> carro.getCor().equalsIgnoreCase("verde")));
        System.out.println(filtrar(numeros, numero -> numero % 2 == 0)); // com lambda
        System.out.println(filtrar(numeros, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        })); // sem lambda
    }
}
