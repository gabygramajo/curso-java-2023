package manejoDeFechas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fechas {
    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("fecha = " + fecha);
        //>> fecha = Sat Dec 23 10:01:24 ART 2023

        //## Formatear fecha:
        SimpleDateFormat df1 = new SimpleDateFormat("dd MMMM, yyyy");
        String fecha2 = df1.format(fecha);
        System.out.println("fecha2 = " + fecha2);
        //>> fecha2 = 23 diciembre, 2023

        SimpleDateFormat df2 = new SimpleDateFormat("dd MM, yyyy");
        String fecha3 = df2.format(fecha);
        System.out.println("fecha3 = " + fecha3);
        //>> fecha3 = 23 12, 2023

        SimpleDateFormat df3 = new SimpleDateFormat("dd-MM-yyyy");
        String fecha4 = df3.format(fecha);
        System.out.println("fecha4 = " + fecha4);
        //>> fecha4 = 23-12-2023
    }
}
