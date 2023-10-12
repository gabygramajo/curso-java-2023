public class EtiquetasEnForLoop {
    public static void main(String[] args) {

        //etiqueta en referencia al for exterior
        bucle1:
        for (int i = 0; i <= 10; i++) {
            System.out.println();//salto de linea

            for (int j = 0; j < 5; j++) {

                if (i % 2 == 1)
                    continue bucle1; //saltea el forj y vuelve al fori

                //print no realiza el salto de linea en consola
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }

        }

    }
}
