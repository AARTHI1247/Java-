import java.util.Scanner;

public class Q8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double transactionAmount = scan.nextDouble();
        scan.nextLine();
        String category = scan.nextLine();
        String tier = scan.nextLine();
        String promo = scan.nextLine();

        double baseRate = 1.0;

        double categoryBonus = 0;

        if(category.equals("Groceries")){
            categoryBonus = 2.0;
        }
        else if(category.equals("Dining")){
            categoryBonus = 2.5;
        }
        else if(category.equals("Travel")){
            categoryBonus = 3.0;
        }
        else if(category.equals("Gas")){
            categoryBonus = 2.0;
        }
        else{
            categoryBonus = 1.0;
        }

        double tierMultiplier = 0;

        if(tier.equals("Basic")){
            tierMultiplier = 1.0;
        }
        else if(tier.equals("Gold")){
            tierMultiplier = 1.25;
        }
        else if(tier.equals("Platinum")){
            tierMultiplier = 1.5;
        }
        else if(tier.equals("Black")){
            tierMultiplier = 2.0;
        }

        double promoMultiplier = 0;

        if(promo.equals("None")){
            promoMultiplier = 1.0;
        }
        else if(promo.equals("Double-Points")){
            promoMultiplier = 2.0;
        }
        else if(promo.equals("Triple-Points")){
            promoMultiplier = 3.0;
        }

        double pointsEarned = transactionAmount * baseRate * categoryBonus * tierMultiplier * promoMultiplier;
        double cashValue = pointsEarned * 0.01;

        String rewardsTier;

        if(tier.equals("Basic")){
            rewardsTier = "Basic Rewards";
        }
        else if(tier.equals("Gold")){
            rewardsTier = "Gold Rewards";
        }
        else if(tier.equals("Platinum")){
            rewardsTier = "Platinum Rewards";
        }
        else{
            rewardsTier = "Black Rewards";
        }

        System.out.println("Transaction Amount: " + transactionAmount);
        System.out.println("Points Earned: " + pointsEarned);
        System.out.println("Cash Value: $" + cashValue);
        System.out.println("Rewards Tier: " + rewardsTier);
    }
}
