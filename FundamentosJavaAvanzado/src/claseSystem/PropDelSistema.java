package claseSystem;

public class PropDelSistema {
    public static void main(String[] args) {

        // obtener nombre del usuario del sistema
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        // obtener la ruta del usuario
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        // obtener la ruta del directorio de trabajo
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        // obtener la version de java utilizada
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

    }
}
