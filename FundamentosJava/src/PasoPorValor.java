public class PasoPorValor {
    public static void main(String[] args) {
        int i = 10;

        System.out.println("i = " + i);
        // >> i = 10

        testPrimitive(2);
        // >> (1) i = 2
        // >> (2) i = 20

        System.out.println("i = " + i);
        // >> i = 10, los valores primitivos y sus Wrapper son inmutables, se pasan por valor.

    }
    
    public static void testPrimitive(int i ) {
        System.out.println("(1) i = " + i);
        i = 20;
        System.out.println("(2) i = " + i);
    }

}
