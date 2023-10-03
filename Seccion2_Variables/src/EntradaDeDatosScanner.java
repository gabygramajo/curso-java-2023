import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDeDatosScanner {
    public static void main(String[] args) {
//ventana de dialogo - swift
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        //int nroStr = sc.nextInt();
        //sc.close();

        int nroIntDecimal = 0;
        //manejo de excepciones
        try {
            //nroIntDecimal = Integer.parseInt(nroStr);
            nroIntDecimal = sc.nextInt();
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Error, debe ingresar un nro entero.");
            //Volvemos a ejecutar el main
            main(args);
            //Para ejecutar una sola vez
            System.exit(0);
        }

        //Concatenar
        String message = "Decimal  = " + nroIntDecimal;
        message += "\nBinario: " + Integer.toBinaryString(nroIntDecimal);
        message += "\nOctal: " + Integer.toOctalString(nroIntDecimal);
        message += "\nHexa: " + Integer.toHexString(nroIntDecimal).toUpperCase();

        //por terminal
        System.out.println(message);
    }
}
