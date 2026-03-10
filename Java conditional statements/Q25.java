import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double data = scan.nextDouble();
        int minutes = scan.nextInt();
        scan.nextLine();
        String international = scan.nextLine();
        String device = scan.nextLine();

        System.out.println("Data Usage: " + data + " GB");
        System.out.println("Call Minutes: " + minutes + " minutes");
        System.out.println("International Usage: " + international);
        System.out.println("Device Type: " + device);

        String plan = "";
        double baseCost = 0;
        double dataOver = 0;
        double callOver = 0;
        double internationalFee = 0;
        double deviceFee = 0;

        if(data <= 5){
            plan = "Basic 5GB";
            baseCost = 30;
        }
        else if(data <= 10){
            plan = "Standard 5GB";
            baseCost = 40;
        }
        else{
            plan = "Premium 10GB";
            baseCost = 60;
        }

        if(data > 5){
            dataOver = (data - 5) * 10;
        }

        if(minutes > 500){
            callOver = (minutes - 500) * 0.05;
        }

        if(international.equals("Light")){
            internationalFee = 5;
        }
        else if(international.equals("Moderate")){
            internationalFee = 10;
        }
        else if(international.equals("Heavy")){
            internationalFee = 20;
        }

        if(device.equals("Phone")){
            deviceFee = 5;
        }
        else if(device.equals("Tablet")){
            deviceFee = 10;
        }
        else if(device.equals("Hotspot")){
            deviceFee = 15;
        }

        double total = baseCost + dataOver + callOver + internationalFee + deviceFee;

        String category;

        if(plan.contains("Basic")){
            category = "Basic";
        }
        else if(plan.contains("Standard")){
            category = "Standard";
        }
        else{
            category = "Premium";
        }

        double savings = 0;
        if(total > 60){
            savings = total - 60;
        }

        System.out.println("Recommended Plan: " + plan);
        System.out.println("Base Plan Cost: $" + baseCost);
        System.out.println("Data Overage: $" + dataOver);
        System.out.println("Call Overage: $" + callOver);
        System.out.println("International Fee: $" + internationalFee);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + total);
        System.out.println("Potential Savings: $" + savings);
        System.out.println("Plan Category: " + category);
    }
}
