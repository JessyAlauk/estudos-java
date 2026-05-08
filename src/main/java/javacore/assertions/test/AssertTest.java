package javacore.assertions.test;

public class AssertTest {
    static void main() {
        calculaSalario(2000);
    }

    private static void calculaSalario(double salario) {
        assert (salario > 0);
    }
}
