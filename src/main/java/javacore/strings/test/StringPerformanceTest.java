package javacore.strings.test;

public class StringPerformanceTest {
    static void main() {
        long inicio = System.currentTimeMillis();
        contatString(30000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim-inicio) + "ms");

        long inicioBuilder = System.currentTimeMillis();
        contatStringBuilder(700000);
        long fimBuilder = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuilder: " + (fimBuilder-inicioBuilder) + "ms");

        long inicioBuffer = System.currentTimeMillis();
        contatStringBuffer(700000);
        long fimBuffer = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuffer: " + (fimBuffer-inicioBuffer) + "ms");
    }

    private static void contatString(int tam){
        String string = "";
        for (int i=0; i < tam; i++){
            string += i;
        }
    }

    private static void contatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for (int i=0; i < tam; i++){
            sb.append(i);
        }
    }

    private static void contatStringBuffer(int tam){
        StringBuffer sf = new StringBuffer(tam);
        for (int i=0; i < tam; i++){
            sf.append(i);
        }
    }
}
