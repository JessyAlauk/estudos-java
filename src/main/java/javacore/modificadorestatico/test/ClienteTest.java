package javacore.modificadorestatico.test;


import javacore.modificadorestatico.classes.Cliente;

public class ClienteTest {
    static void main() {
        Cliente cliente = new Cliente();
        System.out.println("Exibindo a quantidade de parcelas possíveis");
        for (int parcela : cliente.getParcelas()){
            System.out.print(parcela + " ");
        }
    }
}
