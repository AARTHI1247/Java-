import java.util.Scanner;

public class Q7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String room = scan.nextLine();
        String season = scan.nextLine();
        int nights = scan.nextInt();
        scan.nextLine();
        String loyalty = scan.nextLine();

        double baseRate = 0;

        if(room.equals("Standard")){
            baseRate = 150;
        }
        else if(room.equals("Deluxe")){
            baseRate = 300;
        }
        else if(room.equals("Suite")){
            baseRate = 500;
        }
        else if(room.equals("Presidential")){
            baseRate = 1000;
        }

        double seasonalMultiplier = 0;

        if(season.equals("Off-Peak")){
            seasonalMultiplier = 0.7;
        }
        else if(season.equals("Regular")){
            seasonalMultiplier = 1.0;
        }
        else if(season.equals("Peak")){
            seasonalMultiplier = 1.5;
        }
        else if(season.equals("Holiday")){
            seasonalMultiplier = 2.0;
        }

        double extendedDiscount = 0;

        if(nights >= 1 && nights <= 4){
            extendedDiscount = 0;
        }
        else if(nights >= 5 && nights <= 7){
            extendedDiscount = 5;
        }
        else if(nights >= 8 && nights <= 14){
            extendedDiscount = 10;
        }
        else{
            extendedDiscount = 20;
        }

        double loyaltyDiscount = 0;

        if(loyalty.equals("None")){
            loyaltyDiscount = 0;
        }
        else if(loyalty.equals("Member")){
            loyaltyDiscount = 10;
        }
        else if(loyalty.equals("Gold")){
            loyaltyDiscount = 15;
        }
        else if(loyalty.equals("Platinum")){
            loyaltyDiscount = 20;
        }

        double seasonalRate = baseRate * seasonalMultiplier;
        double discountedRate = seasonalRate * (1 - extendedDiscount/100) * (1 - loyaltyDiscount/100);
        double totalCost = discountedRate * nights;

        String upgrade;

        if(loyalty.equals("Platinum") && room.equals("Suite")){
            upgrade = "Presidential Upgrade";
        }
        else if(loyalty.equals("Gold") && room.equals("Deluxe")){
            upgrade = "Suite Upgrade";
        }
        else if(loyalty.equals("Member")){
            upgrade = "Deluxe Upgrade";
        }
        else{
            upgrade = "No Upgrade";
        }

        System.out.println("Room Type: " + room);
        System.out.println("Season: " + season);
        System.out.println("Nights Booked: " + nights);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Upgrade: " + upgrade);
    }
}
