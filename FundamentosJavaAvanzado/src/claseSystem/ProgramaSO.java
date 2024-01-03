package claseSystem;

import java.io.IOException;

public class ProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        String SistemaOperativo = System.getProperty("os.name").toLowerCase();
        try {
            if (SistemaOperativo.startsWith("windows")) { // si es win
                proceso = rt.exec("notepad");
            } else if (SistemaOperativo.startsWith("mac"))  { // si es linux
                proceso = rt.exec("textedit");
            } else if (SistemaOperativo.startsWith("linux"))  { // si es linux
                proceso = rt.exec("gedit");

            } else {
                proceso = rt.exec("gedit");
            }
            // esperar a que se cierre el programa
            proceso.waitFor();
        } catch (Exception e) {
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
