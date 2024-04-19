import java.util.Scanner;

public class Ejer_2 {
    public static void rangoNum (int a, int b) {
        if (a > b) {
            return;
        }
        System.out.println(a + " ");
        rangoNum(a + 1, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo numero: ");
        int b = sc.nextInt();
        System.out.println("Los números naturales entre " + a + " y " + b + " son:");
        rangoNum(a, b);
    }
}
