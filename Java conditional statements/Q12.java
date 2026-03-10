import java.util.Scanner;

public class Q2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String coverage = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        String vehicle = scan.nextLine();
        String record = scan.nextLine();

        double basePremium = 0;

        if(coverage.equals("Basic")){
            basePremium = 500;
        }
        else if(coverage.equals("Standard")){
            basePremium = 800;
        }
        else if(coverage.equals("Comprehensive")){
            basePremium = 1500;
        }

        double ageFactor;

        if(age>=16 && age<=21){
            ageFactor = 1.8;
        }
        else if(age>=22 && age<=25){
            ageFactor = 1.5;
        }
        else if(age>=26 && age<=40){
            ageFactor = 1.0;
        }
        else if(age>=41 && age<=60){
            ageFactor = 0.9;
        }
        else{
            ageFactor = 1.1;
        }

        double vehicleFactor = 0;

        if(vehicle.equals("Sedan")){
            vehicleFactor = 1.0;
        }
        else if(vehicle.equals("SUV")){
            vehicleFactor = 1.2;
        }
        else if(vehicle.equals("Sports")){
            vehicleFactor = 1.5;
        }
        else if(vehicle.equals("Truck")){
            vehicleFactor = 1.1;
        }

        double recordAdjustment = 0;

        if(record.equals("Clean")){
            recordAdjustment = -10;
        }
        else if(record.equals("Minor-Violations")){
            recordAdjustment = 25;
        }
        else if(record.equals("Major-Violations")){
            recordAdjustment = 50;
        }

        double adjustedPremium = basePremium * ageFactor * vehicleFactor;
        double finalPremium = adjustedPremium * (1 + recordAdjustment/100);
        double monthlyPremium = finalPremium / 12;

        String risk;

        if(ageFactor>=1.5 || vehicleFactor>=1.5 || recordAdjustment>=25){
            risk = "High";
        }
        else if(ageFactor>1.0){
            risk = "Medium";
        }
        else{
            risk = "Low";
        }

        System.out.println("Adjusted Premium: " + adjustedPremium);
        System.out.println("Final Premium: " + finalPremium);
        System.out.println("Monthly Premium: " + monthlyPremium);
        System.out.println("Risk Category: " + risk);
    }
}
