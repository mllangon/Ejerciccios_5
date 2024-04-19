import java.util.Scanner;
public class Ejer_4 {
    public static int potencia(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * potencia(x, y - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base (x): ");
        int x = scanner.nextInt();

        System.out.print("Ingrese el exponente (y): ");
        int y = scanner.nextInt();

        System.out.println(x + " elevado a " + y + " es: " + potencia(x, y));

        scanner.close();
    }
}
