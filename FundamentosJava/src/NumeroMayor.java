import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué numero es mayor?");
        System.out.println("Nro 1: ");
        int num1 = sc.nextInt();

        System.out.println("Nro 2: ");
        int num2 = sc.nextInt();
        sc.close();

        String mayorMenor = (num1 > num2)
                ? num1 + " Es mayor que " + num2
                : num2 + " Es mayor que " + num1;

        System.out.println(mayorMenor);
    }
}
