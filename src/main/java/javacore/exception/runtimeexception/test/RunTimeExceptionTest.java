package javacore.exception.runtimeexception.test;

public class RunTimeExceptionTest {
    static void main() {
        try{
            divisao(10,0);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void divisao(int num1, int num2) {
        if(num2 == 0){
            throw new IllegalArgumentException("Nao existe dvisao com zero, seu animal!");
        }
        int result = num1/num2;
        System.out.println(result);
    }
}
