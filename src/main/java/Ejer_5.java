import java.util.Scanner;

public class Ejer_5 {
    public static int maximoVector(int[] vector, int index) {
        if (index == vector.length - 1) {
            return vector[index];
        }
        return Math.max(vector[index], maximoVector(vector, index + 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de elementos en el vector: ");
        int n = scanner.nextInt();
        int[] vector = new int[n];

        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        System.out.println("El máximo valor del vector es: " + maximoVector(vector, 0));

        scanner.close();
    }
}
