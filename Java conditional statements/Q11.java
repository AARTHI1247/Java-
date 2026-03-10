import java.util.Scanner;

public class Q11{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double orderValue = scan.nextDouble();
        scan.nextLine();
        String loyalty = scan.nextLine();
        String time = scan.nextLine();
        String type = scan.nextLine();

        double discount = 0;

        if(loyalty.equals("Gold")){
            discount = 15;
        }
        else if(loyalty.equals("Silver")){
            discount = 10;
        }
        else if(loyalty.equals("Bronze")){
            discount = 5;
        }
        else{
            discount = 0;
        }

        if(time.equals("Late-Night")){
            discount = discount + 5;
        }

        double serviceFee = 0;

        if(type.equals("Delivery")){
            serviceFee = orderValue * 0.10;
        }
        else if(type.equals("Takeout")){
            serviceFee = orderValue * 0.03;
        }
        else{
            serviceFee = 0;
        }

        double discountedValue = orderValue * (1 - discount/100);
        double finalAmount = discountedValue + serviceFee;

        String priority;

        if(time.equals("Peak") && type.equals("Delivery")){
            priority = "High";
        }
        else if(time.equals("Regular")){
            priority = "Medium";
        }
        else{
            priority = "Low";
        }

        int prepTime;

        if(type.equals("Delivery") && priority.equals("High")){
            prepTime = 30;
        }
        else if(type.equals("Delivery")){
            prepTime = 25;
        }
        else if(type.equals("Takeout")){
            prepTime = 20;
        }
        else{
            prepTime = 15;
        }

        System.out.println("Discounted Value: " + discountedValue);
        System.out.println("Service Fee: " + serviceFee);
        System.out.println("Final Amount: " + finalAmount);
        System.out.println("Kitchen Priority: " + priority);
        System.out.println("Preparation Time: " + prepTime + " minutes");
    }
}
