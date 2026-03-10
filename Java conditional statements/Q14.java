import java.util.Scanner;

public class Q14{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String tier = scan.nextLine();
        int contractMonths = scan.nextInt();
        scan.nextLine();
        String access = scan.nextLine();
        String addon = scan.nextLine();

        double baseFee = 0;

        if(tier.equals("Basic")){
            baseFee = 40;
        }
        else if(tier.equals("Premium")){
            baseFee = 80;
        }
        else if(tier.equals("Elite")){
            baseFee = 120;
        }
        else if(tier.equals("VIP")){
            baseFee = 150;
        }

        double contractDiscount = 0;

        if(contractMonths == 1){
            contractDiscount = 0;
        }
        else if(contractMonths == 6){
            contractDiscount = 10;
        }
        else if(contractMonths == 12){
            contractDiscount = 15;
        }
        else if(contractMonths == 24){
            contractDiscount = 25;
        }

        double accessFee = 0;

        if(access.equals("Single-Location")){
            accessFee = 0;
        }
        else if(access.equals("Regional")){
            accessFee = 20;
        }
        else if(access.equals("Nationwide")){
            accessFee = 50;
        }

        double addOnFee = 0;

        if(addon.equals("None")){
            addOnFee = 0;
        }
        else if(addon.equals("Personal-Training")){
            addOnFee = 100;
        }
        else if(addon.equals("Classes")){
            addOnFee = 50;
        }
        else if(addon.equals("Full-Package")){
            addOnFee = 200;
        }

        double discountedBase = baseFee * (1 - contractDiscount/100);
        double monthlyTotal = discountedBase + accessFee + addOnFee;
        double contractTotal = monthlyTotal * contractMonths;

        double normalTotal = (baseFee + accessFee + addOnFee) * contractMonths;
        double savings = normalTotal - contractTotal;

        String category;

        if(tier.equals("VIP") || monthlyTotal >= 200){
            category = "Luxury";
        }
        else if(tier.equals("Elite") || monthlyTotal >= 120){
            category = "High";
        }
        else if(tier.equals("Premium") || monthlyTotal >= 80){
            category = "Standard";
        }
        else{
            category = "Basic";
        }

        System.out.println("Tier: " + tier);
        System.out.println("Contract Months: " + contractMonths);
        System.out.println("Monthly Total: " + monthlyTotal);
        System.out.println("Contract Total: " + contractTotal);
        System.out.println("Savings: " + savings);
        System.out.println("Category: " + category);
    }
}
