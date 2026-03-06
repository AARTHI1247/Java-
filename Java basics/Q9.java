import java.util.*;
import java.util.Scanner;
public class Q9{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int roomCharge =scan.nextInt();
        int days=scan.nextInt();
        int medicineCost=scan.nextInt();
        int labFees =scan.nextInt();
        int insuranceCoverage =scan.nextInt();
        int prod=roomCharge*days;
        int sum=prod+medicineCost+labFees-insuranceCoverage;
        System.out.println(sum);
    }
}
