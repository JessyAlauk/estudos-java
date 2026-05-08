package javacore.heranca.test;

import javacore.heranca.classes.Endereco;
import javacore.heranca.classes.Funcionario;
import javacore.heranca.classes.Pessoa;

public class HerancaTest {
    static void main() {

        Endereco end = new Endereco("Rua dos Alfeneiros","Limoeiro");
        Pessoa p = new Pessoa("Gina","111.222.333-44",end);
        p.imprime();
        System.out.println("========================");
        Funcionario f = new Funcionario("Olivia Dean","444.333.222-11",end,4500);
        f.imprime();
    }
}
