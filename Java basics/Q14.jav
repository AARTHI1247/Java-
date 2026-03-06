import java.util.*;
import java.util.Scanner;
public class Q14{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int baseSalary=scan.nextInt();
        int sessions=scan.nextInt();
        int payPerSession=scan.nextInt();
        int bonus=scan.nextInt();
        int maintenanceFee=scan.nextInt();
        int prod=sessions*payPerSession;
        int sum=prod+baseSalary+bonus-maintenanceFee;
        System.out.println(sum);
    }
}
