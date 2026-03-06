import java.util.*;
import java.util.Scanner;
public class Q5{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int totalBill  =scan.nextInt();
        int service=scan.nextInt();
        int gst=scan.nextInt();
        int numberOfPeople=scan.nextInt();
        int tvalue=(totalBill*service)/100;
        int gstvalue=(totalBill*gst)/100;
        int sum=totalBill+tvalue+gstvalue;
        int value=sum/numberOfPeople;
        System.out.println(value);
    }
}
