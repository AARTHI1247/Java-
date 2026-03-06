import java.util.*;
import java.util.Scanner;
public class Q2{          
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int basecount=scan.nextInt();
        int extraGB=scan.nextInt();
        int ratePerGB=scan.nextInt();
        int tax=scan.nextInt();
        int pd=extraGB*ratePerGB;
        int sum=basecount+pd;
        int tvalue=(sum*tax)/100;
        int value=sum+tvalue;
        System.out.println(value);
    }
}
