import java.util.Scanner;
public class Q4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String Tier = scan.nextLine();
        double Value = scan.nextDouble();
        scan.nextLine();
        String Category = scan.nextLine();
        String Membership = scan.nextLine();
        System.out.println("Loyalty Tier: " + Tier);
        System.out.println("Cart Value: " + Value);
        System.out.println("Product Category: " + Category);
        System.out.println("Membership: " + Membership);
        int dp=0;
        int cv=0;
        int b=0;
        
        if(Tier.equalsIgnoreCase("Platinum")){
           dp=15;
        }
        else if(Tier.equalsIgnoreCase("Gold")){
            dp=12;
        }
        else if(Tier.equalsIgnoreCase("Silver")){
            dp=8;
        }
        else if(Tier.equalsIgnoreCase("Bronze")){
            dp=5;
        }
        if(Value>=500 && Value<=999){
            cv=3;
         }
         else if(Value>=1000 && Value<=1999){
            cv=5;
         }
        else if(Value>=2000){
            cv=7;
        }
        if(Category.equalsIgnoreCase("Electronics")){
            b=5;
         }
         else if(Category.equalsIgnoreCase("Fashion")){
            b=3;
         }
         else if(Category.equalsIgnoreCase("Books")){
            b=5;
         }
         else if(Category.equalsIgnoreCase("Groceries")){
            b=2;
         }
        
        int td=dp+cv+b;
        double fp=cv*(1-td/100.0);
        double s=cv-fp;
        System.out.println("Base Discount:" + dp);
        System.out.println("Additional Discount:" + cv);
        System.out.println("Total Discount" + td);
        System.out.println("Final Price: $" +fp);
        System.out.println("Savings:$"+s);
         scan.close();
    }
}
