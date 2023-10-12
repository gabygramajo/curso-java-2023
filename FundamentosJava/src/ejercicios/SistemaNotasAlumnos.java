package ejercicios;

import java.util.Scanner;

public class SistemaNotasAlumnos {
    public static void main(String[] args) {
        double notasMayores5 = 0, notasMayores4 = 0, notasMayores1 = 0;
        int contNotaMayores5 = 0, contNotaMayores4 = 0, contNotaMayores1 = 0;
        Scanner sc = new Scanner(System.in);
        double nota = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Ingresar Nota ("+ i + "/20): ");
            nota = sc.nextDouble();

            if (nota == 0){
                System.out.println("Error finalizando el programa...");
                break;
            } else if(nota >= 5 && nota <= 7){
                notasMayores5 += nota;
                contNotaMayores5++;
            } else if(nota > 1 && nota <= 4){
                notasMayores4 += nota;
                contNotaMayores4++;
            } else if(nota > 0 && nota <= 1 ){
                notasMayores1 += nota;
                contNotaMayores1++;
            }
        }
        sc.close();

        if(nota != 0) {
            double promedio1 = notasMayores5/contNotaMayores5;
            String promedios = "Promedio notas mayores que 5: " + (promedio1);

            double promedio2 = notasMayores4/contNotaMayores4;
            promedios = promedios.concat("\nPromedio notas menores que 4: " + (promedio2));

            double promedio3 = notasMayores1/contNotaMayores1;
            promedios = promedios.concat("\nPromedio notas iguales a 1: " + (promedio3));

            System.out.println(promedios);
            System.out.println("Promedio Total = " + (promedio1 + promedio2 + promedio3));
        }
    }
}
