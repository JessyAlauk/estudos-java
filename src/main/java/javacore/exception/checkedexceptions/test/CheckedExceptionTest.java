package javacore.exception.checkedexceptions.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class CheckedExceptionTest {
    static void main() throws IOException {
        abrirArquivo();
    }

    public static void criarArquivo() throws IOException {
        try {
            File file = new File("Teste.txt");
            System.out.println("Arquivo criado? : " + file.createNewFile());
            System.out.println("Arquivo criado.");
        } catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static String abrirArquivo() throws IOException {
        try {
            System.out.println("Arquivo criado.");
            System.out.println("Arquivo aberto.");
//            throw new Exception();
            System.out.println("Escrevendo no arquivo.");
            return "Valor";
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Arquivo fechado.");
        }

        try{
            talvezLanceUmaExcessao();
        } catch (SQLException | IOException _){

        }

        return null;


    }

    private static void talvezLanceUmaExcessao () throws SQLException, FileNotFoundException, IOException {

    }
}
