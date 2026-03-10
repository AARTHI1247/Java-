import java.util.Scanner;

public class Q21{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double hours = scan.nextDouble();
        scan.nextLine();
        String zone = scan.nextLine();
        String vehicle = scan.nextLine();
        String membership = scan.nextLine();

        double baseRate = 5.0;
        double zonePremium = 0;
        double vehicleSurcharge = 0;
        double membershipDiscount = 0;
        double dailyCap = 0;

        if (zone.equals("Downtown")) {
            zonePremium = 50;
            dailyCap = 150;
        }
        else if (zone.equals("Business-District")) {
            zonePremium = 30;
            dailyCap = 120;
        }
        else if (zone.equals("Residential")) {
            zonePremium = 0;
            dailyCap = 60;
        }
        else if (zone.equals("Airport")) {
            zonePremium = 100;
            dailyCap = 180;
        }

        if (vehicle.equals("Motorcycle")) {
            vehicleSurcharge = -2;
        }
        else if (vehicle.equals("Compact")) {
            vehicleSurcharge = 0;
        }
        else if (vehicle.equals("Sedan")) {
            vehicleSurcharge = 0;
        }
        else if (vehicle.equals("SUV")) {
            vehicleSurcharge = 3;
        }
        else if (vehicle.equals("Oversized")) {
            vehicleSurcharge = 5;
        }

        double rawFee = (baseRate * (1 + zonePremium / 100) + vehicleSurcharge) * hours;

        if (membership.equals("None")) {
            membershipDiscount = 0;
        }
        else if (membership.equals("Monthly")) {
            membershipDiscount = 20;
        }
        else if (membership.equals("Annual")) {
            membershipDiscount = 25;
        }
        else if (membership.equals("VIP")) {
            membershipDiscount = 30;
        }

        double calculatedFee = rawFee * (1 - membershipDiscount / 100);

        double finalFee;

        if (hours >= 24) {
            if (calculatedFee > dailyCap) {
                finalFee = dailyCap;
            }
            else {
                finalFee = calculatedFee;
            }
        }
        else {
            finalFee = calculatedFee;
        }

        String category;

        if (zone.equals("Downtown")) {
            category = "Premium Zone";
        }
        else if (zone.equals("Business-District")) {
            category = "Business Zone";
        }
        else if (zone.equals("Residential")) {
            category = "Standard Zone";
        }
        else {
            category = "High Security Zone";
        }

        System.out.println("Final Parking Fee: $" + finalFee);
        System.out.println("Rate Category: " + category);
    }
}
