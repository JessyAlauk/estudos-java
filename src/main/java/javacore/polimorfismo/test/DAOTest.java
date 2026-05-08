package javacore.polimorfismo.test;

import javacore.polimorfismo.classes.DatabaseDAOImpl;
import javacore.polimorfismo.classes.GenericDAO;

import java.util.Arrays;

public class DAOTest {
    static void main() {
        GenericDAO arquivoDAO = new DatabaseDAOImpl();
        arquivoDAO.save();

        var lista = Arrays.asList("nome1", "nome2", "nome3", "nome4", "nome5");
        lista.forEach(System.out::println);
    }
}
