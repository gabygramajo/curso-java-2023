import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {
        String username = "admin";
        String password = "123456";

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar Username: ");
        String userLog = sc.nextLine();

        System.out.println("Ingresar Password: ");
        String userPassword = sc.nextLine();
        sc.close();

        boolean esAutenticado = false;

        if(username.equals(userLog) && password.equals(userPassword))
            esAutenticado = true;
        else
            System.out.println("Username o contraseña incorrecta.");

        if (esAutenticado)
            System.out.println("Bienvenido usuario ".concat(username).concat("!"));
        else
            System.out.println("Lo siento, requiere autenticación.");

    }
}
