public class EstructuraString {
    public static void main(String[] args) {
        //De forma Literal implicita simplificada
        String texto1 = "Aprendiendo a programar en Java";
        //Instancia explicita desde la clase/constructor String
        String texto2 = new String("Aprendiendo a programar en Java");

        System.out.println("Son iguales (==): " + (texto1 == texto2));
        //>> false
        System.out.println("Son iguales (equals()): " + texto1.equals(texto2));
        //>> true

        String palabra1 = "Perro";
        String palabra2 = "PeRRo";

        System.out.println("Son iguales (equals()): " + palabra1.equals(palabra2));
        //>> false
        System.out.println("Son iguales (equalsIgnoreCase()): " + palabra1.equalsIgnoreCase(palabra2));
        //>> true

        //Concatenacion
        String lenguaje = "Java";
        String oracion = "Aprendiendo";

        String concatenar1 = oracion + lenguaje;
        System.out.println("concatenar1 = " + concatenar1);
        concatenar1 = oracion + " " + lenguaje;
        System.out.println("concatenar1 = " + concatenar1);
        
        String concatenar2 = oracion.concat(lenguaje);
        System.out.println("concatenar2 = " + concatenar2);
        concatenar2 = oracion.concat(" ").concat(lenguaje);
        System.out.println("concatenar2 = " + concatenar2);
        
        //INMUTABILIDAD DE LOS STRINGS
        
        String a = "Python";
        String b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b = "Java";
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //ej2
        String curso = "Programación Java";
        String profesor = "Andres Guzman";
        String resultado = curso.transform( c -> {
            return c + " con " + profesor;
        });

        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);

        //ej3
        String resultado2 = resultado.replace("a", "A");
        System.out.println("\nresultado = " + resultado);
        System.out.println("resultado2 = " + resultado2);
    }
}
