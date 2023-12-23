public class PasoPorReferencia {
    public static void main(String[] args) {
        int[] edades = {10, 12, 43};

        for (int edad :
                edades) {
            System.out.println("edad = " + edad);
        }
        // edad = 10
        // edad = 12
        // edad = 43
        testArr(edades);

        for (int edad :
                edades) {
            System.out.println("edad = " + edad);
        }
        // edad = 20
        // edad = 24
        // edad = 86

        // Los objetos sí son mutables, por lo cual se pasan por referencia.
    }

    public static void testArr(int[] arrValue) {
        for (int i = 0; i < arrValue.length; i++) {
            arrValue[i] *= 2;
        }
    }
}
