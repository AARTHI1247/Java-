import java.util.Scanner;

public class Q24{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double distance = scan.nextDouble();
        double orderValue = scan.nextDouble();
        scan.nextLine();
        String peakTime = scan.nextLine();
        String weather = scan.nextLine();

        double baseFee = 3.0;
        double distanceFee = distance * 1.0;
        double peakFee = 0;
        double weatherFee = 0;
        double discount = 0;

        if(peakTime.equals("Breakfast")){
            peakFee = 0;
        }
        else if(peakTime.equals("Lunch")){
            peakFee = 2.5;
        }
        else if(peakTime.equals("Dinner")){
            peakFee = 2.0;
        }
        else if(peakTime.equals("Late-Night")){
            peakFee = 1.5;
        }

        if(weather.equals("Clear")){
            weatherFee = 0;
        }
        else if(weather.equals("Rain")){
            weatherFee = 2;
        }
        else if(weather.equals("Snow")){
            weatherFee = 3;
        }
        else if(weather.equals("Storm")){
            weatherFee = 5;
        }

        if(orderValue >= 30 && orderValue < 50){
            discount = 1;
        }
        else if(orderValue >= 50 && orderValue < 75){
            discount = 3;
        }
        else if(orderValue >= 75){
            discount = 5;
        }

        double finalFee = baseFee + distanceFee + peakFee + weatherFee - discount;

        if(finalFee < 2.99){
            finalFee = 2.99;
        }

        double deliveryTime = distance * 8;

        if(peakTime.equals("Lunch") || peakTime.equals("Dinner")){
            deliveryTime = deliveryTime + 10;
        }

        if(weather.equals("Rain")){
            deliveryTime = deliveryTime + 5;
        }
        else if(weather.equals("Snow")){
            deliveryTime = deliveryTime + 10;
        }
        else if(weather.equals("Storm")){
            deliveryTime = deliveryTime + 15;
        }

        String priority;

        if(orderValue > 60){
            priority = "Express";
        }
        else if(peakTime.equals("Lunch") || peakTime.equals("Dinner")){
            priority = "High";
        }
        else{
            priority = "Standard";
        }

        System.out.println("Delivery Fee: $" + finalFee);
        System.out.println("Estimated Delivery Time: " + deliveryTime + " minutes");
        System.out.println("Priority: " + priority);
    }
}
