package javacore.exception.customexception;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Deu ruim, o login ou a senha ta errada.");
    }
}
