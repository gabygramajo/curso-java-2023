public class StringMetodos {
    public static void main(String[] args) {
        String str = "Programacion";

        System.out.println("str.length() = " + str.length());
        System.out.println("str.toUpperCase() = " + str.toUpperCase());
        System.out.println("str.toLowerCase() = " + str.toLowerCase());

        System.out.println("str.equals(\"Programacion\") = " + str.equals("Programacion"));
        System.out.println("str.equals(\"programacion\") = " + str.equals("programacion"));
        System.out.println("str.equalsIgnoreCase(\"proGramaCion\") = " + str.equalsIgnoreCase("proGramaCion"));

        System.out.println("str.compareTo(\"Lenguaje\") = " + str.compareTo("Lenguaje"));

        System.out.println("str.charAt(0) = " + str.charAt(0));
        System.out.println("str.charAt(2) = " + str.charAt(2));

        System.out.println("str.indexOf('g') = " + str.indexOf('g'));
        System.out.println("str.indexOf('g') = " + str.indexOf('c'));


        System.out.println("str.substring(6) = " + str.substring(6));
        System.out.println("str.substring(3, 8) = " + str.substring(3, 8));
        System.out.println("str.substring(str.indexOf('g'), str.indexOf('c')) = " + str.substring(str.indexOf('g'), str.indexOf('c')));
        
        String text = "aprendiendo a programar";
        System.out.println("text = " + text);
        System.out.println("text.replace(\"a\", \"A\") = " + text.replace("a", "A"));
        System.out.println("text.lastIndexOf('a') = " + text.lastIndexOf('a'));
        System.out.println("text.lastIndexOf('Z') = " + text.lastIndexOf('Z'));
        text += " Java, Python y JavaScript";
        System.out.println("text = " + text);
        System.out.println("text.contains(\"Python\"): " + text.contains("Python"));

    }
}
