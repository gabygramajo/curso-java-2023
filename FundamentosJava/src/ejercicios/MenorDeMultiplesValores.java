package ejercicios;

import java.util.Scanner;

public class MenorDeMultiplesValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeticiones = 0;

        do {
            System.out.println("Cantidad de números a comparar (min 10): ");
            repeticiones = sc.nextInt();
        }while (repeticiones < 10);

        System.out.println("n° 1: ");
        int numero = sc.nextInt();
        int min = numero;

        for (int i = 2; i <= repeticiones; i++) {
            System.out.println("n°"+ i + ": ");
            numero = sc.nextInt();

            if (min > numero)
                min = numero;
        }
        sc.close();

        if(min < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El numero menor es igual o mayor que 10!");
        }
    }
}
