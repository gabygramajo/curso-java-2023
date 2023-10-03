public class ValidarString {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("es null: " + esNulo);
        //>> true

        //prevenir error con string nulo
        if(!esNulo) {
            System.out.println(curso.toUpperCase());
        }
        //cuando un valor es nulo, lanza la excepcion de "NullPointerException"

        //String vacio
        String str1 = "";
        System.out.println("1- str1 es igual null:" + (str1 == null)); // >> false
        System.out.println("2- str1 es vacio:" + (str1.length() == 0)); // >> true
        System.out.println("3- str1 es vacio:" + str1.isEmpty()); // >> >> true

        String str2 = " ";
        System.out.println("4- str2 es igual null:" + (str2 == null)); // >> false
        System.out.println("5- str2 es vacio:" + (str2.length() == 0)); // >> false
        System.out.println("6- str2 es vacio:" + str2.isEmpty()); // >> >> false

        str2 = str2.trim();
        System.out.println("7- str2 es vacio:" + (str2.length() == 0)); // >> true
        System.out.println("8- str2 es vacio:" + str2.isEmpty()); // >> >> true
    }
}
