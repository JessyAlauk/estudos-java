package javacore.enums.test;

import javacore.enums.classes.Cliente;
import javacore.enums.classes.TipoCliente;

public class ClienteTest {
    static void main() {
        Cliente c = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.AVISTA );
        System.out.println(c);
        System.out.println(c.getTipoCliente().getId());
    }
}
