package javacore.exception.error.test;

public class ErrorTest {
    static void main() {
        stackOverFlowError();
    }

    public static void stackOverFlowError(){
        stackOverFlowError();
    }
}
