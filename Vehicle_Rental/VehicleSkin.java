package Vehicle_Rental;
import java.util.Scanner;


public class VehicleSkin {
    public static void main(String[] sigma) {
        Scanner sc = new Scanner(System.in);
        Vehicle vehicle = new Vehicle();
        
        System.out.print("What is your registration number?: ");
        vehicle.setRegistration(sc.nextLine());
        
        System.out.print("What is your vehicle's brand?: ");
        vehicle.setBrand(sc.nextLine());

        System.out.print("What is the rental rate for the day? (In Php/Day): ");
        vehicle.setrentalRate(sc.nextDouble());

        System.out.print("How many days will you rent this car?: ");
        vehicle.setrentalDays(sc.nextDouble());

        for (int i = 0; i < 3; i++)
            try {
                System.out.println("\rProcessing..");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }

        vehicle.displayInfo();
        sc.close();


    }
}
