package ejercicios;

import javax.swing.*;

public class EjercicioNombreMasLargo {
    public static void main(String[] args) {
        String nombreCompleto1 = JOptionPane.showInputDialog(null,"1 - Nombre y Apellido: ");
        String nombreCompleto2 = JOptionPane.showInputDialog(null,"2 - Nombre y Apellido: ");

        String nombreMasLargo = (
                nombreCompleto1.split(" ")[0].length() > nombreCompleto2.split(" ")[0].length())
                ? nombreCompleto1
                : nombreCompleto2;

        String nombreCompleto3 = JOptionPane.showInputDialog(null,"3 - Nombre y Apellido: ");

        nombreMasLargo = (
                nombreMasLargo.split(" ")[0].length() > nombreCompleto3.split(" ")[0].length())
                ? nombreMasLargo
                : nombreCompleto3;

        String mensaje = nombreMasLargo.concat(" tiene el nombre más largo.");
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
