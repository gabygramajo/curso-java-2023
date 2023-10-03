public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto String";

        Integer numero = 10;

        boolean valor = numero instanceof Integer;

        System.out.println("1 - numero instanceof Integer = " + valor );
        //>> 1 - numero instanceof Integer = true

        valor = texto instanceof String;

        System.out.println("2 - texto instanceof String = " + valor );
        //>> 2 - texto instanceof String = true

        // instanceof sólo sirve para comparar objetos, no datos primitivos, y tampoco castea.

        // instanceof CON TIPOS ABSTRACTOS

        Object texto2 = "Creando un objeto String";

        valor = texto2 instanceof Object;
        System.out.println("3 - texto2 instanceof Object = " + valor );
        //>> 3 - texto2 instanceof Object = true

        valor = texto2 instanceof String;
        System.out.println("4 - texto2 instanceof String = " + valor );
        //>> 4 - texto2 instanceof String = true

        valor = texto2 instanceof Integer;
        System.out.println("5 - texto2 instanceof Integer = " + valor );
        //>> 5 - texto2 instanceof Integer = false

        Object numero2 = 2;
        valor = numero2 instanceof Long;
        System.out.println("5 - numero2 instanceof Long = " + valor );
        //>> 6 - numero2 instanceof Long = false
    }
}
