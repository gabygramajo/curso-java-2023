public class ForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        String estudiantes[] = {"Juan", "Adriana", "Miguel", "Nicolás", "Luisa"};

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("estudiante " + i + " = " + estudiantes[i]);
        }

        // continue
        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i + " es Impar");
        }

        // break
        for (int i = 1; i <= 10; i++) {
            if(i == 5){
                break;
            }
            System.out.println(i);
        }

        // ForEach
        for (String estudiante:
             estudiantes) {
            System.out.println(estudiante);
        }
    }
}
