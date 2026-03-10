import java.util.Scanner;

public class Q9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String speed = scan.nextLine();
        double weight = scan.nextDouble();
        scan.nextLine();
        String zone = scan.nextLine();
        String size = scan.nextLine();

        double baseRate = 0;

        if(speed.equals("Economy")){
            baseRate = 5;
        }
        else if(speed.equals("Standard")){
            baseRate = 10;
        }
        else if(speed.equals("Express")){
            baseRate = 25;
        }
        else if(speed.equals("Overnight")){
            baseRate = 50;
        }

        double weightSurcharge = weight * 1;

        double zoneMultiplier = 0;

        if(zone.equals("Local")){
            zoneMultiplier = 1.0;
        }
        else if(zone.equals("Regional")){
            zoneMultiplier = 1.2;
        }
        else if(zone.equals("National")){
            zoneMultiplier = 1.5;
        }
        else if(zone.equals("International")){
            zoneMultiplier = 3.0;
        }

        double sizeSurcharge = 0;

        if(size.equals("Small")){
            sizeSurcharge = 0;
        }
        else if(size.equals("Medium")){
            sizeSurcharge = 5;
        }
        else if(size.equals("Large")){
            sizeSurcharge = 15;
        }
        else if(size.equals("Oversized")){
            sizeSurcharge = 30;
        }

        double baseCost = (baseRate + weightSurcharge) * zoneMultiplier;
        double totalCost = baseCost + sizeSurcharge;

        String deliveryTime;

        if(speed.equals("Economy")){
            if(zone.equals("Local")){
                deliveryTime = "3-5 days";
            }
            else if(zone.equals("Regional")){
                deliveryTime = "5-7 days";
            }
            else if(zone.equals("National")){
                deliveryTime = "7-10 days";
            }
            else{
                deliveryTime = "14-21 days";
            }
        }
        else if(speed.equals("Standard")){
            if(zone.equals("Local")){
                deliveryTime = "2-3 days";
            }
            else if(zone.equals("Regional")){
                deliveryTime = "3-5 days";
            }
            else if(zone.equals("National")){
                deliveryTime = "5-7 days";
            }
            else{
                deliveryTime = "10-14 days";
            }
        }
        else if(speed.equals("Express")){
            if(zone.equals("Local")){
                deliveryTime = "1 day";
            }
            else if(zone.equals("Regional")){
                deliveryTime = "1-2 days";
            }
            else if(zone.equals("National")){
                deliveryTime = "2-3 days";
            }
            else{
                deliveryTime = "3-5 days";
            }
        }
        else{
            deliveryTime = "1 day";
        }

        String serviceLevel;

        if(speed.equals("Economy")){
            serviceLevel = "Basic Service";
        }
        else if(speed.equals("Standard")){
            serviceLevel = "Standard Service";
        }
        else if(speed.equals("Express")){
            serviceLevel = "Priority Service";
        }
        else{
            serviceLevel = "Premium Service";
        }

        System.out.println("Shipping Speed: " + speed);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Delivery Time: " + deliveryTime);
        System.out.println("Service Level: " + serviceLevel);
    }
}
