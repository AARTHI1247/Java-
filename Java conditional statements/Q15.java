import java.util.Scanner;

public class Q15{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String license = scan.nextLine();
        int userCount = scan.nextInt();
        scan.nextLine();
        String support = scan.nextLine();
        int contractYears = scan.nextInt();

        double basePrice = 0;

        if(license.equals("Standard")){
            basePrice = 60;
        }
        else if(license.equals("Professional")){
            basePrice = 120;
        }
        else if(license.equals("Enterprise")){
            basePrice = 200;
        }

        double volumeDiscount = 0;

        if(userCount >= 1 && userCount <= 50){
            volumeDiscount = 0;
        }
        else if(userCount >= 51 && userCount <= 200){
            volumeDiscount = 15;
        }
        else if(userCount >= 201 && userCount <= 500){
            volumeDiscount = 20;
        }
        else if(userCount >= 501 && userCount <= 1000){
            volumeDiscount = 25;
        }
        else{
            volumeDiscount = 35;
        }

        double supportFee = 0;

        if(support.equals("Basic")){
            supportFee = 10;
        }
        else if(support.equals("Priority")){
            supportFee = 30;
        }
        else if(support.equals("Premium")){
            supportFee = 80;
        }

        double multiYearDiscount = 0;

        if(contractYears == 1){
            multiYearDiscount = 0;
        }
        else if(contractYears == 2){
            multiYearDiscount = 5;
        }
        else if(contractYears == 3){
            multiYearDiscount = 10;
        }
        else if(contractYears == 5){
            multiYearDiscount = 20;
        }

        double discountedBase = basePrice * (1 - volumeDiscount/100);
        double annualPerUser = (discountedBase + supportFee) * (1 - multiYearDiscount/100);
        double totalAnnual = annualPerUser * userCount;
        double contractValue = totalAnnual * contractYears;

        String tier;

        if(userCount < 200){
            tier = "Small Business";
        }
        else if(userCount >= 200 && userCount <= 1000){
            tier = "Mid-Market";
        }
        else{
            tier = "Enterprise";
        }

        System.out.println("License Type: " + license);
        System.out.println("User Count: " + userCount);
        System.out.println("Annual Per User: " + annualPerUser);
        System.out.println("Total Annual: " + totalAnnual);
        System.out.println("Contract Value: " + contractValue);
        System.out.println("Pricing Tier: " + tier);
    }
}
