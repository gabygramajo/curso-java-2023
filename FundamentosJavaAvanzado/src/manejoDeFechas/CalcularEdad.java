package manejoDeFechas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        int anioActual = Integer.parseInt(format.format(fechaActual));

        Scanner sc = new Scanner(System.in);
        int fecha = 0;

        try {
            System.out.println("Ingresar año de nacimiento: ");
            fecha = sc.nextInt();
            sc.close();
            System.out.println("Tu edad es: " + (anioActual - fecha) + " años.");

        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un año válido.");
        }
    }
}
