import java.util.*;
import java.text.*;

public class Ejer_12 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Date> dates = new ArrayList<>();

        System.out.print("¿Cuántas fechas desea ingresar? ");
        int count = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline

        for (int i = 0; i < count; i++) {
            System.out.print("Ingrese la fecha #" + (i + 1) + " (formato dd/mm/yyyy): ");
            String dateStr = scanner.nextLine();
            dates.add(sdf.parse(dateStr));
        }

        Collections.sort(dates);
        System.out.println("Fechas ordenadas:");
        for (Date date : dates) {
            System.out.println(sdf.format(date));
        }
    }
}
