import java.util.Scanner;

public class Ejer_3 {
    public static int cuentaDigitos (int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + cuentaDigitos(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int n = sc.nextInt();
        int digitos = n == 0 ? 1 : cuentaDigitos(Math.abs(n));
        System.out.println("El número " + n + " tiene " + digitos + " dígitos.");

    }
}
