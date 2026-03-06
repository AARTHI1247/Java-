import java.util.*;
import java.util.Scanner;
public class Q12{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int ticketRevenue  =scan.nextInt();
        int snackRevenue   =scan.nextInt();
        int maintenance  =scan.nextInt();
        int electricity  =scan.nextInt();
        int sum=ticketRevenue+snackRevenue-maintenance-electricity;
        System.out.println(sum);
    }
}
