import java.util.*;
import java.util.Scanner;
public class Q10{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int deliveries=scan.nextInt();
        int payout =scan.nextInt();
        int incentive =scan.nextInt();
        int fuelCost =scan.nextInt();
        int prod=deliveries*payout;
        int sum=prod+incentive-fuelCost;
        System.out.println(sum);
    }
}
