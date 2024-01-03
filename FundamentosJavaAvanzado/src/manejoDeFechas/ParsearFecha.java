package manejoDeFechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParsearFecha {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date fecha = format.parse("2021-05-24");
            System.out.println("fecha = " + fecha);
            //>> fecha = Mon May 24 00:00:00 ART 2021
            System.out.println("fecha = " + format.format(fecha));
            //>> fecha = 2021-05-24
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
