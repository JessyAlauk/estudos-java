package javacore.exception.checkedexceptions.test;

import javacore.exception.checkedexceptions.classes.Funcionario;
import javacore.exception.checkedexceptions.classes.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest {
    static void main() {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();

        try {
            f.salvar();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
