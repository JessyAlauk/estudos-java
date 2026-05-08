package javacore.exception.checkedexceptions.classes;

public class Leitor2 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Fechou o segundo.");
    }
}
