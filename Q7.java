import java.util.*;
import java.util.Scanner;
public class Q7{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int daysWorked =scan.nextInt();
        int wagePerDay =scan.nextInt();
        int overtimeBonus=scan.nextInt();
        int maintenanceCharge=scan.nextInt();
        int prod=daysWorked*wagePerDay;
        int sum=prod+overtimeBonus;
        int value=sum-maintenanceCharge;
        System.out.println(value);
    }
}
