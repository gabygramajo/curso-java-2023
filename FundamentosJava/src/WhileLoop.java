public class WhileLoop {
    public static void main(String[] args) {
        int i = 0;

        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        boolean prueba = false;
        do {
            System.out.println("Se ejecuta, al menos, una vez");
        }while (prueba);

    }
}
