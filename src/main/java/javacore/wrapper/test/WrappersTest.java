package javacore.wrapper.test;

public class WrappersTest {
    static void main() {
        byte b = 1;
        short s = 10;
        int i = 100;
        long l = 1000;
        float f = 10000;
        double d = 100000.00;
        char c = 'a';
        boolean boo = true;

        Byte bWrapper = 1;
        Short sWrapper = 10;
        Integer iWrapper = Integer.valueOf("111");
        Long lWrapper = 1000L;
        Float fWrapper = 100000F;
        Character cWrapper = 'b';
        Boolean booWrapper = false;

        int novo = Integer.parseInt("111");

        System.out.println(i);

        System.out.println(Character.isDigit(1));
        System.out.println(Character.isLetterOrDigit('a'));

        Character lower = Character.toLowerCase('A');
        Character upper = Character.toUpperCase('a');

        System.out.println(lower);
        System.out.println(upper);
    }
}
