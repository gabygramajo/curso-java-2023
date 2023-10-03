import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String a = "", b = "", c = "";

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingresar 1er familiar: ");
            a = sc.nextLine();
            System.out.println("Ingresar 2do familiar: ");
            b = sc.nextLine();
            System.out.println("Ingresar 3er familiar: ");
            c = sc.nextLine();
            sc.close();
        } catch (Exception e) {
            System.out.println(e);
            main(args);
            System.exit(0);
        }
        String subStr1 = a.toUpperCase().charAt(1) + "." + a.substring(a.length() - 2);
        String subStr2 = b.toUpperCase().charAt(1) + "." + b.substring(b.length() - 2);
        String subStr3 = c.toUpperCase().charAt(1) + "." + c.substring(c.length() - 2);

        String str = subStr1 + "_" + subStr2 + "_" + subStr3;
        System.out.println(str);
    }
}
