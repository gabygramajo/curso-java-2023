public class OperadorTernarioJava {
    public static void main(String[] args) {
        //variable = condicion ? si es verdadero: si es falso;

        String estado = "";

        double promedio = 6.2;

        estado = promedio >= 5.59 ? "aprobada" : "desaprobada";

        System.out.println("Materia: " + estado);

    }
}
