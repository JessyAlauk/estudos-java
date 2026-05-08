package javacore.sobrescrita.test;

import javacore.sobrescrita.classes.Pessoa;

public class PessoaTest {
    static void main() {
        Pessoa p = new Pessoa();
        p.setIdade(12);
        p.setNome("Jose da Silva");
        System.out.println(p);
    }
}
