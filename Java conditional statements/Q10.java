import java.util.Scanner;

public class Q10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String Day = scan.nextLine();
        double Consumption = scan.nextDouble();
        double Energy = scan.nextDouble();
        scan.nextLine();
        String Tier = scan.nextLine();

        System.out.println("Time of Day:" + Day);
        System.out.println("Power Consumption:" + Consumption);
        System.out.println("Renewable Energy:" + Energy);
        System.out.println("Rate Tier:" + Tier);

        double br = 0;
        double rm = 0;

        if(Tier.equalsIgnoreCase("Basic")){
            br = 0.18;
        }
        else if(Tier.equalsIgnoreCase("Time-of-Use")){
            br = 0.15;
        }
        else if(Tier.equalsIgnoreCase("Premium-Green")){
            br = 0.12;
        }

        if(Day.equalsIgnoreCase("Peak")){
            rm = 1.8;
        }
        else if(Day.equalsIgnoreCase("Off-Peak")){
            rm = 1.0;
        }
        else if(Day.equalsIgnoreCase("Super-Off-Peak")){
            rm = 0.6;
        }

        double rc = Consumption * (Energy / 100) * br;
        double cost = (Consumption * br * rm) - rc;

        System.out.println("Total Cost:" + cost);

        if(Day.equalsIgnoreCase("Peak") && Energy < 20){
            System.out.println("Shift to Off-Peak");
        }
        else if(Energy > 50){
            System.out.println("Excellent! Continue");
        }
        else if(Tier.equalsIgnoreCase("Basic") && Consumption > 500){
            System.out.println("Upgrade to Time-of-Use");

            double peakCost = Consumption * br * 1.6;
            double offPeakCost = Consumption * br * 0.9;
            double savings = peakCost - offPeakCost;

            System.out.println("Potential Savings:" + savings);
        }
    }
}
