package manejoDeFechas;

import java.util.Date;

public class Milisegundos {
    public static void main(String[] args) {
        Date inicial = new Date();

        long j = 0;

        for (int i = 0; i < 10000000; i++) {
            j += i;
        }

        Date fin = new Date();

        System.out.println("j = " + j);
        //>> j = 49999995000000

        // Calc el tiempo
        long tiempoFinal = fin.getTime() - inicial.getTime();
        System.out.println("tiempoFinal = " + tiempoFinal);
        //>> tiempoFinal = 5
    }
}
