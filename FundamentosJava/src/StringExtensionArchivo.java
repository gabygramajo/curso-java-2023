public class StringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_Imagen.jpeg";

        System.out.println("archivo = " + archivo);
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));
        System.out.println("archivo.substring(archivo.length() - 4) = " + archivo.substring(archivo.length() - 4));

        System.out.println("\narchivo.indexOf('.') = " + archivo.indexOf('.'));
        System.out.println("archivo.substring(archivo.indexOf('.')) = " + archivo.substring(archivo.indexOf('.')));
        archivo = "alguna.Imagen.jpeg";
        System.out.println("\narchivo = " + archivo);
        System.out.println("archivo.substring(archivo.indexOf('.')) = " + archivo.substring(archivo.indexOf('.')));
        System.out.println("archivo.substring(archivo.lastIndexOf('.')) = " + archivo.substring(archivo.lastIndexOf('.')));

    }
}
