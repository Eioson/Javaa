package ThreeClasses_8_5;

public class Vehicle{
    String registrationNumber;
    String brand;
    double rentalRatePerDay;
    double rentalDays;
    
    public void setRegistration(String _RN){
        registrationNumber = _RN;
    }

    public void setBrand(String comp){
        brand = comp;
    }

    public void setrentalRate(double rrd){
        rentalRatePerDay = rrd;
    }

    public void setrentalDays(double _RD){
        rentalDays = _RD;
    }

    public double getRN(){
        double totalRentalCost = rentalRatePerDay * rentalDays;
        return totalRentalCost;
    }

    public void displayInfo(){
        System.out.println("Order Confirmation:"
        + "\n"
        + "\tRegistration Number: " + registrationNumber 
        + "\n\tBrand: " + brand 
        + "\n\tRental Rate Per Day: " + rentalRatePerDay
        + "\n\tRental Days: " + rentalDays + "Day(s)"
        + "\n\tTotal Rental Cost: " + getRN());

        System.out.println("\n"
        + "Thank you for your order!");
    }
}