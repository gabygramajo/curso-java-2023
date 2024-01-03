package claseSystem;

import java.util.Map;

public class ManejoDeVariablesDeEntorno {
    public static void main(String[] args) {
        // obtener todas las variables de entorno del sistema
        Map<String, String> varEnv = System.getenv();

        String name, path;

        for (Map.Entry<String, String> vars :
                varEnv.entrySet()) {
            name = vars.getKey();
            path = vars.getValue();

            System.out.println(name + "\t" + path);
        }

        // obtener una variable de entorno
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);
    }
}
