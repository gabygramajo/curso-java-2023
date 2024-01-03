package manejoDeFechas;

import java.util.Calendar;
import java.util.Date;

public class CalendarClass {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        
        Date fechaActual = calendar.getTime();
        System.out.println("fechaActual = " + fechaActual);
        //>> fechaActual = Sat Dec 23 10:27:15 ART 2023

        calendar.set(2022, 5, 25);
        Date fecha2022 = calendar.getTime();
        System.out.println("fecha2022 = " + fecha2022);
        //>> fecha2022 = Sat Jun 25 10:27:15 ART 2022

        calendar.set(2022, 5, 25, 19, 20, 10);
        Date fecha2022ConHora = calendar.getTime();
        System.out.println("fecha2022ConHora = " + fecha2022ConHora);
        //>> fecha2022ConHora = Sat Jun 25 19:20:10 ART 2022
    }
}
