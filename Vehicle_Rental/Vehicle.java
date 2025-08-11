package Vehicle_Rental;

public class Vehicle{
    String registrationNumber;
    String brand;
    double rentalRatePerDay;
    double rentalDays;
    
    public void setRegistration(String RN){
        registrationNumber = RN;
    }

    public void setBrand(String comp){
        brand = comp;
    }

    public void setrentalRate(double rrd){
        rentalRatePerDay = rrd;
    }

    public void setrentalDays(double RD){
        rentalDays = RD;
    }

    public double getRN(){
        double totalRentalCost = rentalRatePerDay * rentalDays;
        return totalRentalCost;
    }

    public void displayInfo(){
        System.out.println("Order Confirmation:"
        + "\n"
        + "\n\tRegistration Number: " + registrationNumber 
        + "\n\tBrand: " + brand 
        + "\n\tRental Rate Per Day: Php " + rentalRatePerDay
        + "\n\tRental Days: " + rentalDays + " Day(s)"
        + "\n"
        + "\n\tTotal Rental Cost: " + getRN());

        System.out.println(
        "\n"
        + "Thank you for your order!"
        +"\n");
    }
}