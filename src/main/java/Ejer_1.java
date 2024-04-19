import java.util.Scanner;

public class Ejer_1 {
    public static int sumaNaturales(int n) {
        if (n == 0) {
            return 0;
        } else {
            int suma = n + sumaNaturales(n - 1);
            System.out.println("La suma de los números naturales hasta " + n + " es " + suma);
            return suma;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Qué número quieres que sea n? ");
        int n = scanner.nextInt();
        sumaNaturales(n);
    }
}