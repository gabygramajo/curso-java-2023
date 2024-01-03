package manejoDeFechas;

import java.util.Calendar;
import java.util.Date;

public class CompararFechas {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(2022, 5, 25);
        Date fecha1 = calendar.getTime();
        System.out.println("fecha1 = " + fecha1);
        //>> fecha2022 = Sat Jun 25 10:27:15 ART 2022

        Date fecha2 = new Date();

        if( fecha1.after(fecha2)) {
            System.out.println("fecha1 es después de fecha2 " + fecha1);
        } else if (fecha1.before(fecha2)) {
            System.out.println("fecha1 es antes de fecha2 " + fecha1);
        } else if (fecha1.equals(fecha2)) {
            System.out.println("fecha1 es la misma que fecha2 " + fecha1);
        }

        //>> fecha1 es antes de fecha2 Sat Jun 25 10:48:33 ART 2022

        if( fecha1.compareTo(fecha2) > 0) {
            System.out.println("fecha1 es después de fecha2 " + fecha1);
        } else if (fecha1.compareTo(fecha2) < 0) {
            System.out.println("fecha1 es antes de fecha2 " + fecha1);
        } else if (fecha1.compareTo(fecha2) == 0) {
            System.out.println("fecha1 es la misma que fecha2 " + fecha1);
        }

        //>> fecha1 es antes de fecha2 Sat Jun 25 10:51:22 ART 2022
    }
}
