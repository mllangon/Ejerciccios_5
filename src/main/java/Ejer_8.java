import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejer_8 {
    public static void main(String[] args) {
        char[] bases = {'A', 'T', 'G', 'C'};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa genera una cadena de ADN aleatoria y cuenta el número de genes en la cadena.");
        System.out.println("Un gen se define como la secuencia 'ATG' en la cadena de ADN.");
        System.out.print("Por favor, introduce la longitud de la cadena de ADN: ");
        int n = 0;
        try {
            n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor, introduce un número entero.");
            System.exit(1);
        }

        StringBuilder cadenaADN = new StringBuilder(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            cadenaADN.append(bases[random.nextInt(bases.length)]);
        }
        String cadena = cadenaADN.toString();
        System.out.println("La cadena de ADN generada es: " + cadena);

        int numGenes = 0;
        for (int i = 0; i < cadena.length() - 2; i++) {
            if (cadena.substring(i, i + 3).equals("ATG")) {
                numGenes++;
            }
        }

        System.out.println("La cadena de ADN generada contiene " + numGenes + " genes.");
    }
}