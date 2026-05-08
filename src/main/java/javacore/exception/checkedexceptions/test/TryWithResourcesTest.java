package javacore.exception.checkedexceptions.test;

import javacore.exception.checkedexceptions.classes.Leitor1;
import javacore.exception.checkedexceptions.classes.Leitor2;

import java.io.*;

public class TryWithResourcesTest {
    static void main() throws IOException {
        lerArquivoNew();
    }

    public static void lerArquivoOld() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("text.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void lerArquivoNew(){
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2())
        {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
