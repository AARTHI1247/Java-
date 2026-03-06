import java.util.*;
import java.util.Scanner;
public class Q11{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int distance =scan.nextInt();
        int rate  =scan.nextInt();
        int maintenance  =scan.nextInt();
        int allowance  =scan.nextInt();
        int subsidy  =scan.nextInt();
        int prod=distance*rate;
        int sum=prod+maintenance+allowance-subsidy;
        System.out.println(sum);
    }
}
