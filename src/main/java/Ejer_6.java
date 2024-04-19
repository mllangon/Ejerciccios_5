import java.util.Scanner;

public class Ejer_6 {
    public static int hexDecimal(String hex, int length) {
        if (length == 0) {
            return 0;
        }
        char ch = hex.charAt(length - 1);
        int digit = Character.isDigit(ch) ? ch - '0' : ch - 'A' + 10;
        return digit + 16 * hexDecimal(hex, length - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de dígitos hexadecimales: ");
        String hex = scanner.nextLine().toUpperCase();

        System.out.println("El valor decimal de " + hex + " es: " + hexDecimal(hex, hex.length()));

        scanner.close();
    }
}
