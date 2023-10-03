public class PrimitivoChar {
    public static void main(String[] args) {
        System.out.println("Datos Primitivos - CHAR");

        //FLOAT
        char nroCHar = 'a';
        System.out.println("\nnroCHar = " + nroCHar);
        System.out.println("El tipo Char corresponde en Bytes a = " + Character.BYTES);
        System.out.println("El tipo Char corresponde en Bits a = " + Character.SIZE);

        //unicode
        nroCHar = 64;
        System.out.println("\nnroCHar (64) = " + nroCHar);

        nroCHar = '\u0040';
        System.out.println("\nnroCHar (\\u0040) = " + nroCHar);

    }
}
