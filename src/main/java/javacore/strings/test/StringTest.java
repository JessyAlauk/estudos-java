package javacore.strings.test;

public class StringTest {
    static void main() {
        String nome = "William";
        nome = nome.concat(" Suanne"); // igual nome+= " Suanne";
        System.out.println(nome);

        String teste = "Naruto";
        String teste2 = "    naruto";
        System.out.println(teste.charAt(4));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste.replace('a','o'));
        System.out.println(teste2.toLowerCase());
        System.out.println(teste.toUpperCase());
        System.out.println(teste.substring(0,4));
        System.out.println(teste2.trim());



    }
}
