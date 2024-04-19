import java.util.Scanner;

public class Ejer_7 {
    public static int coeficienteBinomial(int n, int k) {
        if (k > n) {
            System.out.println("k no puede ser mayor que n. Devolviendo 0.");
            return 0;
        }
        if (k == 0 || k == n) {
            System.out.println("k es 0 o igual a n. Devolviendo 1.");
            return 1;
        }
        System.out.println("Calculando coeficiente binomial para n = " + n + " y k = " + k);
        return coeficienteBinomial(n - 1, k) + coeficienteBinomial(n - 1, k - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa calcula el coeficiente binomial de n y k.");
        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese k: ");
        int k = scanner.nextInt();

        System.out.println("C(" + n + ", " + k + ") = " + coeficienteBinomial(n, k));

        scanner.close();
    }
}