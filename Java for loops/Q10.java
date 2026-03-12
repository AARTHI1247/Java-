import java.util.*;
import java.util.Scanner;
public class Q10{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double st=0;
        double tax=0,sc=0,gt=0;
        for(int i=0;i<n;i++){
            String name=scan.next();
            double price=scan.nextDouble();
            int q=scan.nextInt();
            st=price*q;
            tax=st*0.08;
            sc=st*0.10;
            gt=st+tax+sc;
            System.out.println("Item:"+name);
            System.out.println("Price:$"+price+" x "+n);
            System.out.println("Subtotal:"+st);
            System.out.println();
        }
        System.out.println("Total items:"+n);
        System.out.println("Subtotal:$"+st);
        System.out.println("Tax:"+tax);
        System.out.println("Service Charge:$"+sc);
        System.out.println("Grand Total: $"+gt);
    }
}
