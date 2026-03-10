import java.util.Scanner;

public class Q19{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String format = scan.nextLine();
        String seat = scan.nextLine();
        String time = scan.nextLine();
        String customer = scan.nextLine();

        double basePrice = 12;

        double formatSurcharge = 0;

        if(format.equals("2D")){
            formatSurcharge = 0;
        }
        else if(format.equals("3D")){
            formatSurcharge = 5;
        }
        else if(format.equals("IMAX")){
            formatSurcharge = 8;
        }
        else if(format.equals("4DX")){
            formatSurcharge = 10;
        }

        double seatUpgrade = 0;

        if(seat.equals("Standard")){
            seatUpgrade = 0;
        }
        else if(seat.equals("Premium")){
            seatUpgrade = 4;
        }
        else if(seat.equals("Recliner")){
            seatUpgrade = 7;
        }

        double timeAdjustment = 0;

        if(time.equals("Matinee")){
            timeAdjustment = -30;
        }
        else if(time.equals("Evening")){
            timeAdjustment = 0;
        }
        else if(time.equals("Prime-Time")){
            timeAdjustment = 20;
        }
        else if(time.equals("Late-Night")){
            timeAdjustment = -20;
        }

        double customerDiscount = 0;

        if(customer.equals("Adult")){
            customerDiscount = 0;
        }
        else if(customer.equals("Senior")){
            customerDiscount = 25;
        }
        else if(customer.equals("Student")){
            customerDiscount = 15;
        }
        else if(customer.equals("Child")){
            customerDiscount = 30;
        }

        double baseWithSurcharges = basePrice + formatSurcharge + seatUpgrade;
        double adjustedPrice = baseWithSurcharges * (1 + timeAdjustment/100);
        double finalPrice = adjustedPrice * (1 - customerDiscount/100);

        String voucher;

        if(time.equals("Matinee") || customer.equals("Senior") || customer.equals("Student") || customer.equals("Child")){
            voucher = "Yes";
        }
        else{
            voucher = "No";
        }

        String category;

        if(finalPrice < 10){
            category = "Budget";
        }
        else if(finalPrice >= 10 && finalPrice <= 15){
            category = "Standard";
        }
        else if(finalPrice > 15 && finalPrice <= 20){
            category = "Premium";
        }
        else{
            category = "Luxury";
        }

        System.out.println("Base With Surcharges: " + baseWithSurcharges);
        System.out.println("Adjusted Price: " + adjustedPrice);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("Concession Voucher: " + voucher);
        System.out.println("Pricing Category: " + category);
    }
}
