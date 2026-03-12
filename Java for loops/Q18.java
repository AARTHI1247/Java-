import java.util.*;
import java.util.Scanner;
public class Q18{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String cond="";
            for(int i=0;i<n;i++){
            int hrs =scan.nextInt();
            double temp=scan.nextInt();
            if(temp>40 || temp<0){
               cond="Average";
            }
            else if(temp>32 && temp<40){
               cond="Hot";
            }
            else if(temp>0 || temp<10){
               cond="cold";
            }
            else if(temp>10 || temp<32){
               cond="normal";
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
