import java.util.Scanner;

public class Q20{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double capacity = scan.nextDouble();
        int users = scan.nextInt();
        scan.nextLine();
        String backup = scan.nextLine();
        String support = scan.nextLine();

        double storageCost = 0;
        double userFee = 0;
        double backupFee = 0;
        double supportFee = 0;

        if (capacity >= 10 && capacity <= 100) {
            storageCost = capacity * 0.05;
        }
        else {
            if (capacity <= 500) {
                storageCost = (100 * 0.05) + (capacity - 100) * 0.04;
            }
            else {
                if (capacity <= 2000) {
                    storageCost = (100 * 0.05) + (400 * 0.04) + (capacity - 500) * 0.03;
                }
                else {
                    storageCost = (100 * 0.05) + (400 * 0.04) + (1500 * 0.03) + (capacity - 2000) * 0.02;
                }
            }
        }

        if (users <= 10) {
            userFee = users * 5;
        }
        else {
            if (users <= 50) {
                userFee = users * 4;
            }
            else {
                userFee = users * 3;
            }
        }

        if (backup.equals("Daily")) {
            backupFee = 0;
        }
        else if (backup.equals("Hourly")) {
            backupFee = 15 + (0.5 * users);
        }
        else if (backup.equals("Real-Time")) {
            backupFee = 50 + (1 * users);
        }

        if (support.equals("Community")) {
            supportFee = 0;
        }
        else if (support.equals("Standard")) {
            supportFee = 20;
        }
        else if (support.equals("Priority")) {
            supportFee = 75;
        }
        else if (support.equals("Enterprise")) {
            supportFee = 200;
        }

        double monthly = storageCost + userFee + backupFee + supportFee;
        double annual = monthly * 12 * 0.9;

        String plan;

        if (users == 1) {
            plan = "Personal";
        }
        else if (users <= 20) {
            plan = "Team";
        }
        else if (users <= 100) {
            plan = "Business";
        }
        else {
            plan = "Enterprise";
        }

        System.out.println("Monthly Cost: $" + monthly);
        System.out.println("Annual Cost: $" + annual);
        System.out.println("Recommended Plan: " + plan);

        if (plan.equals("Personal")) {
            System.out.println("Features: Basic Storage, Community Support");
        }
        else if (plan.equals("Team")) {
            System.out.println("Features: Shared Storage, Daily Backup, Standard Support");
        }
        else if (plan.equals("Business")) {
            System.out.println("Features: Advanced Backup, Priority Support, Collaboration Tools");
        }
        else {
            System.out.println("Features: Unlimited Storage, Real-Time Backup, Enterprise Support");
        }
    }
}
