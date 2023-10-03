import javax.swing.*;

public class EntradaDeDatosJOptionPane {
    public static void main(String[] args) {
        //ventana de dialogo - swing
        String nroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");

        int nroIntDecimal = 0;
        //manejo de excepciones
        try {
            nroIntDecimal = Integer.parseInt(nroStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un nro entero.");
            //Volvemos a ejecutar el main
            main(args);
            //Para ejecutar una sola vez
            System.exit(0);
        }

        //Concatenar
        String message = "Decimal  = " + nroIntDecimal;
        message += "\nBinario: " + Integer.toBinaryString(nroIntDecimal);
        message += "\nOctal: " + Integer.toOctalString(nroIntDecimal);
        message += "\nHexa: " + Integer.toHexString(nroIntDecimal).toUpperCase();
        //por terminal
        System.out.println(message);

        //ventana de dialogo - swing
        JOptionPane.showMessageDialog(null, message);
    }
}
