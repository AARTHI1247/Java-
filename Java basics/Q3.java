import java.util.*;
import java.util.Scanner;
public class Q3{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int sales=scan.nextInt();
        int discount=scan.nextInt();
        int gst=scan.nextInt();
        int perd=(sales*discount)/100;
        int tvalue=sales-perd;
        int gstvalue=(tvalue*gst)/100;
        int value=tvalue+gstvalue;
        System.out.println(value);
    }
}
