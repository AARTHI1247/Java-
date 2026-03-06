import java.util.*;
import java.util.Scanner;
public class Q6{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int distance=scan.nextInt();
        int mileage =scan.nextInt();
        int fuelPrice =scan.nextInt();
        int tollCharge=scan.nextInt();
        int dvalue=distance/mileage;
        int prod=dvalue*fuelPrice;
        int sum=prod+tollCharge;
        System.out.println(sum);
    }
}
