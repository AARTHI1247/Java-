import java.util.*;
import java.util.Scanner;
public class Q8{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int rodsPerHour=scan.nextInt();
        int hoursWorked  =scan.nextInt();
        int overtimeRods =scan.nextInt();
        int rejectedRods=scan.nextInt();
        int prod=rodsPerHour*hoursWorked;
        int sum=prod+overtimeRods-rejectedRods;
        System.out.println(sum);
    }
}
