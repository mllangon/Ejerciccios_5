import java.io.*;
import java.util.*;

public class Ejer_11 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Asegúrate de que las líneas de 'input.txt' estén ordenadas.");
        System.out.print("Ingrese la línea a buscar: ");
        String searchLine = scanner.nextLine();

        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/sorted_output.txt"));
        ArrayList<String> lines = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();

        int index = Collections.binarySearch(lines, searchLine);

        if (index >= 0) {
            System.out.println("Línea encontrada.");
        } else {
            System.out.println("Línea no encontrada.");
        }
    }
}