import java.util.Scanner;

public class PortfolioRisk {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int stockPercentage = scan.nextInt();
        int years = scan.nextInt();
        scan.nextLine();
        String volatility = scan.nextLine();
        String tolerance = scan.nextLine();

        int riskScore = stockPercentage;

        if(years <= 5){
            if(stockPercentage > 50){
                riskScore = riskScore + 20;
            }
        }
        else if(years <= 10){
            if(stockPercentage > 60){
                riskScore = riskScore + 10;
            }
        }
        else if(years <= 20){
            if(stockPercentage > 80){
                riskScore = riskScore + 5;
            }
        }
        else{
            riskScore = riskScore;
        }

        if(volatility.equals("Low")){
            riskScore = riskScore + 0;
        }
        else if(volatility.equals("Medium")){
            riskScore = riskScore + 10;
        }
        else if(volatility.equals("High")){
            riskScore = riskScore + 20;
        }

        String category;

        if(riskScore <= 30){
            category = "Low";
        }
        else if(riskScore <= 60){
            category = "Moderate";
        }
        else if(riskScore <= 80){
            category = "High";
        }
        else{
            category = "Very High";
        }

        String alignment;

        if(tolerance.equals("Conservative")){
            if(category.equals("Low")){
                alignment = "Well Aligned";
            }
            else if(category.equals("Moderate")){
                alignment = "Acceptable";
            }
            else{
                alignment = "Misaligned";
            }
        }
        else if(tolerance.equals("Moderate")){
            if(category.equals("Moderate")){
                alignment = "Well Aligned";
            }
            else if(category.equals("Low") || category.equals("High")){
                alignment = "Acceptable";
            }
            else{
                alignment = "Misaligned";
            }
        }
        else{
            if(category.equals("High") || category.equals("Very High")){
                alignment = "Well Aligned";
            }
            else if(category.equals("Moderate")){
                alignment = "Acceptable";
            }
            else{
                alignment = "Misaligned";
            }
        }

        System.out.println("Risk Score: " + riskScore);
        System.out.println("Risk Category: " + category);
        System.out.println("Alignment Status: " + alignment);

        if(alignment.equals("Well Aligned")){
            System.out.println("Recommendation: Portfolio matches your risk tolerance.");
        }
        else if(alignment.equals("Acceptable")){
            System.out.println("Recommendation: Portfolio is slightly off but manageable.");
        }
        else{
            System.out.println("Recommendation: Consider adjusting stock allocation.");
        }
    }
}
