public class SistemasNumericos {
    public static void main(String[] args) {

        System.out.println("Sistemas Numéricos");

        System.out.println("\nDecimal a Binario:");
        int nroBase10 = 500;
        System.out.println("Nro en Decimal = " + nroBase10);
        System.out.println("Nro en Binario = " + Integer.toBinaryString(nroBase10));

        System.out.println("\nBinario a Decimal:");
        int nroBase2 = 111110100;
        System.out.println("Nro en Decimal = " + nroBase2);
        nroBase2 = 0b111110100;
        System.out.println("Nro en Binario = " + nroBase2);

        System.out.println("\nDecimal a Octal:");
        System.out.println("Nro 500 en Octal = " + Integer.toOctalString(nroBase10));

        System.out.println("\nDecimal a Hexadecimal:");
        System.out.println("Nro 500 en Hexadecimal = " + Integer.toHexString(nroBase10).toUpperCase());
    }
}
