import java.util.*;
import java.util.Scanner;
public class Q15{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int rooms =scan.nextInt();
        int price =scan.nextInt();
        int serviceCharges =scan.nextInt();
        int commission=scan.nextInt();
        int prod=rooms*price;
        int sum=prod+serviceCharges-commission;
        System.out.println(sum);
    }
}
