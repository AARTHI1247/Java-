import java.util.*;
import java.util.Scanner;
public class Q16{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int genPass  =scan.nextInt();
        int genFare  =scan.nextInt();
        int acPass  =scan.nextInt();
        int acFare =scan.nextInt();
        int platform  =scan.nextInt();
        int maintenance=scan.nextInt();
        int fuel =scan.nextInt();
        int prod1=genPass*genFare;
        int prod2=acPass*acFare;
        int sum=prod1+prod2+platform-maintenance-fuel;
        System.out.println(sum);
    }
}
