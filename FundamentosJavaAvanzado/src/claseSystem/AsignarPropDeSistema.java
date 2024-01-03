package claseSystem;

import java.io.FileInputStream;
import java.util.Properties;

public class AsignarPropDeSistema {
    public static void main(String[] args) {
        try { // el manejo de archivo nos obliga a tratar excepciones.
            FileInputStream archivo = new FileInputStream("src/claseSystem/config.properties");

            // cargamos las props del sistema
            Properties props = new Properties(System.getProperties());
            // actualizamos con las nuevas props del archivo
            props.load(archivo);
            props.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto Property");
            System.setProperties(props); // actualizamos las props del sistema

            // obtenemos las props actualizadas del sistema
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty() = " + ps.getProperty("mi.propiedad.personalizada"));
            ps.list(System.out);


        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }
}
