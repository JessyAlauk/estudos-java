package javacore.exception.checkedexceptions.test;

import javacore.exception.customexception.LoginInvalidoException;

public class CustomExceptionTest {
    static void main() {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        String usuario = "Jose";
        String senha = "1234";
        String usuarioDigitado = "Jose";
        String senhaDigitado = "123";
        if (!usuario.equals(usuarioDigitado) | !senha.equals(senhaDigitado)){
            throw new LoginInvalidoException();
        } else {
            System.out.println("Logado.");
        }
    }
}
