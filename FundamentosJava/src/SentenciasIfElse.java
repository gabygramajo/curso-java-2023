public class SentenciasIfElse {
    public static void main(String[] args) {
        //Informar Promedio
        double promedio = 5.5;

        if (promedio >= 6.5) {
            System.out.println("felicitaciones, excelente promedio!");
        } else if (promedio >= 6.0) {
            System.out.println("Muy buen promedio!");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio!");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, necesitas esforzarte más!");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, necesitas estudiar más!");
        } else {
            System.out.println("Reprobado");
        }

        //Año bisiesto
        int mes = 2;
        int nroDias = 0;
        int anio = 1800;

        switch (mes) {
            case 2:
                if(anio % 400 == 0 || ((anio % 4 == 0) && !(anio % 100 == 0))) {
                    nroDias = 29;
                } else {
                    nroDias = 28;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                nroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                nroDias = 31;
                break;
            default:
                System.out.println("Mes incorrecto");
        }

        System.out.println("nroDias = " + nroDias);

    }
}
