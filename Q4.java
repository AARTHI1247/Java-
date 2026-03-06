import java.util.*;
import java.util.Scanner;
public class Q4{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int tuitionFees =scan.nextInt();
        int scholarship=scan.nextInt();
        int examFee=scan.nextInt();
        int libraryFee=scan.nextInt();
        int tvalue=(tuitionFees*scholarship)/100;
         //System.out.println(tvalue);
        int sum=tuitionFees-tvalue;
        int value=sum+examFee+libraryFee;
        System.out.println(value);
    }
}
