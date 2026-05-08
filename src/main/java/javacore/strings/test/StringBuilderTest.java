package javacore.strings.test;

public class StringBuilderTest {
    static void main() {
        String s = "O bagulho é loko";
        StringBuilder sb = new StringBuilder(16);
        sb.append("O bagulho é loko");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.reverse());
        System.out.println(sb.delete(0,2));
        System.out.println(sb.insert(7,"s"));

        StringBuffer sf = new StringBuffer(16);
        sf.append("O bagulho é pampa");
        System.out.println(sf);
        System.out.println(sf.reverse());
        System.out.println(sf.reverse());
        System.out.println(sf.delete(0,2));
        System.out.println(sf.insert(7,"s"));
    }
}
