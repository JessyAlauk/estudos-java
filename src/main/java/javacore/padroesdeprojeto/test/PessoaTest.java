package javacore.padroesdeprojeto.test;

import javacore.padroesdeprojeto.classes.Pessoa;

public class PessoaTest {
    static void main() {
        Pessoa p = new Pessoa.PessoaBuilder("Willian")
                .nome("Willian")
                .nomeDoMeio("Queiroz")
                .ultimoNome("Suane")
                .apelido("JirayaBolado")
                .nomeDaMae("Maria")
                .build();
        System.out.println(p);
    }
}
