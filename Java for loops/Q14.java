import java.util.*;
public class Q14{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double rate=0;
        double fine=0;
        double maxfc=0;
        double actfine=0;
        double totalfine=0;
        int c=0;
            for(int i=0;i<n;i++){
            String name=scan.next();
            int days=scan.nextInt();
            if(name.equalsIgnoreCase("Regular")){
                rate=0.50;
                fine=rate*days;
                maxfc=10;
            }
            else  if(name.equalsIgnoreCase("Reference")){
                rate=1.00;
                fine=rate*days;
                maxfc=20;
            }
            else  if(name.equalsIgnoreCase("Magazine")){
                rate=0.25;
                fine=rate*days;
                maxfc=5;
            }
            actfine=Math.min(fine,maxfc);
            if(days>0){
                c++;
            }
            totalfine=totalfine+actfine;
            System.out.println("Book" +name);
            System.out.println("Days Late:" +days);
            System.out.println("Daily Fine: $"+rate);
            System.out.println("Calculated Fine: $"+fine);
            System.out.println("Actual Fine: $ " +actfine);
            // System.out.println("Cap Applied:  " +sts);
            System.out.println();
        }
        double av=totalfine/n;
        System.out.println("Total books: " +n);
        System.out.println("Total Fines Collected: $" +totalfine);
        System.out.println("Books Overdue:" +c);
        System.out.println("Average Fine: $"+av);
    }
}
