package Vehicle_Rental;

public class Vehicle{
    long customerID;
    String cfn, cln, email, registrationNumber, brand;
    double rentalRatePerDay,rentalDays;
    
    public void setCID(long ID){
        customerID = ID;
    }

    public void setCFN(String FN){
        cfn = FN;
    }

    public void setCLN(String LN){
        cln = LN;
    }

    public void setMail(String Mail){
        email = Mail;
    }
    
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
        + "\n\tCustomer ID: " + customerID 
        + "\n\tFirst Name: " + cfn 
        + "\n\tLast Name: " + cln 
        + "\n\tEmail: " + email 
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