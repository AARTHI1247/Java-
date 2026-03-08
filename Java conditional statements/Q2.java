import java.util.*;
import java.util.Scanner;

public class Q2{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int score = scan.nextInt();
        double income = scan.nextDouble();
        double debt = scan.nextDouble();
        scan.nextLine();
        String type = scan.nextLine();
        
        System.out.println("Credit Score: " + score);
        System.out.println("Annual Income: $" + income);
        System.out.println("Debt-to-Income Ratio: " + debt + "%");
        System.out.println("Loan Type: " + type);
        
        String credit="";
        String debtLevel="";
        String decision="Rejected";
        double amount=0;
        
        // Credit score category
        if(score >= 750){
            credit="Excellent";
        }
        else if(score >= 700){
            credit="Good";
        }
        else if(score >= 650){
            credit="Fair";
        }
        else{
            credit="Poor";
        }
        
        // Debt category
        if(debt <= 30){
            debtLevel="Low";
        }
        else if(debt <= 40){
            debtLevel="Moderate";
        }
        else{
            debtLevel="High";
        }
        
        // Loan rules
        if(type.equalsIgnoreCase("Home")){
            
            if(credit.equals("Excellent") && debtLevel.equals("Low")){
                decision="Approved";
                amount=income*4;
            }
            else if(credit.equals("Good") && debtLevel.equals("Moderate")){
                decision="Needs Review";
                amount=income*3;
            }
            else if(credit.equals("Fair") && debtLevel.equals("Moderate")){
                decision="Needs Review";
                amount=income*3;
            }
        }
        
        else if(type.equalsIgnoreCase("Personal")){
            
            if(credit.equals("Excellent") && debtLevel.equals("Low")){
                decision="Approved";
                amount=income*1;
            }
            else if(credit.equals("Fair") && debtLevel.equals("Moderate")){
                decision="Needs Review";
                amount=income*0.5;
            }
        }
        
        System.out.println("Decision: " + decision);
        System.out.println("Maximum Loan Amount: $" + amount);
    }
}
