public class ValidarString {

    public static void main(String[] args) {
        String resultado;
        String text = null;
        if (!(text == null)) {
            resultado = "Es nulo";
        } else {
            resultado = "No es nulo";
        }

        System.out.println("resultado = " + resultado);

        text = "";
        System.out.println("text isEmpty = " + text.isEmpty());
        System.out.println("text isBlank = " + text.isBlank());
//        text isEmpty = true
//        text isBlank = true

        text = " ";
        System.out.println("text isEmpty = " + text.isEmpty());
        System.out.println("text isBlank = " + text.isBlank());
//        text isEmpty = false
//        text isBlank = true

    }
}
