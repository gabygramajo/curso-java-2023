public class StringMetodosArreglos {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.toCharArray() = ");
        int i = 0;
        for (char c:
                trabalenguas.toCharArray()) {
            System.out.println(i + " " + c);
            i++;
        }

        //Separar utilizando regex - separa palabras unidas con "a"
        System.out.println("trabalenguas.split(\"a\") = ");
        i = 0;
        for (String c:
                trabalenguas.split("a")) {
            System.out.println(i + " " + c);
            i++;
        }
    }
}
