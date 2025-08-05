package ThreeClasses_8_5;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input hours: ");
        int hours = scanner.nextShort();

        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();

        System.out.print("Input seconds: ");
        long seconds = scanner.nextInt();

        // Convert everything to seconds first
        long totalSeconds = (hours * 3600) + (minutes * 60) + seconds;

        // Then convert the total seconds to hours
        double totalHours = totalSeconds / 3600.0;

        System.out.println("Total hours: " + totalHours);

        scanner.close();
    }
}