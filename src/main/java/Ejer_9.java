import java.io.*;
import java.util.*;

public class Ejer_9 {
    public static void main(String[] args) throws IOException {
        System.out.println("Abriendo el archivo input.txt...");
        BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/input.txt"));
        ArrayList<String> lines = new ArrayList<>();
        String line;
        System.out.println("Leyendo líneas del archivo...");
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        System.out.println("Archivo cerrado.");

        System.out.println("Ordenando las líneas...");
        Collections.sort(lines);

        System.out.println("Escribiendo las líneas ordenadas en sorted_output.txt...");
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/sorted_output.txt"));
        for (String sortedLine : lines) {
            writer.write(sortedLine + "\n");
        }
        writer.close();
        System.out.println("Archivo sorted_output.txt cerrado.");
    }
}