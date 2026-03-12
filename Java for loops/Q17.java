import java.util.*;
import java.util.Scanner;
public class Q17{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String priority="";
        int rf=0;
        int d=0;
        int finalfee=0;
        int c=0;
        double totalrev=0;
        double av=0;
            for(int i=0;i<n;i++){
            String member=scan.next();
            String membership=scan.next();
            int days =scan.nextInt();
            if(membership.equalsIgnoreCase("Basic")){
               rf=50;
            }
            else if(membership.equalsIgnoreCase("Premium")){
               rf=100;
            }
            else if(membership.equalsIgnoreCase("vip")){
               rf=200;
            }
            if(days>45){
               d=20;
            }
            else if(days>30 && days<44){
                d=15;
            }
            else if(days>15 && days<29){
                d=10;
            }
            else if(days<15){
                d=0;
            }
            if(days<10){
                priority="Urgent";
                c++;
            }
            else if(days>10 && days<30){
                d=10;
            }
            else if(days>30){
                d=10;
            }
            finalfee=rf*(1-d/100);
            totalrev=totalrev+rf;
            System.out.println("Member: " +member);
            System.out.println("Membership:" +membership);
            System.out.println("Days Until Expiry: "+days);
            System.out.println("Renewal Fee: $"+rf);
            System.out.println("Discount:" +d);
             System.out.println("Final Fee: $" +finalfee);
              System.out.println("Priority: "+priority);
              System.out.println();
            }
            av=totalrev/n;
             System.out.println("Total Members: " +n);
            System.out.println("Urgent Renewals: " +c);
            System.out.println("Total Renewal Revenue: $"+totalrev);
            System.out.println("Average Renewal Fee: $"+av);
    }
}
