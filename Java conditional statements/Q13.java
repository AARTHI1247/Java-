import java.util.Scanner;

public class Q13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String program = scan.nextLine();
        String residency = scan.nextLine();
        String status = scan.nextLine();
        int creditHours = scan.nextInt();

        double baseTuition = 0;

        if(program.equals("Undergraduate")){
            baseTuition = 350;
        }
        else if(program.equals("Graduate")){
            baseTuition = 550;
        }
        else if(program.equals("Professional")){
            baseTuition = 800;
        }

        double residencyMultiplier = 0;

        if(residency.equals("In-State")){
            residencyMultiplier = 1.0;
        }
        else if(residency.equals("Out-of-State")){
            residencyMultiplier = 2.5;
        }
        else if(residency.equals("International")){
            residencyMultiplier = 3.0;
        }

        double programFee = 0;

        if(status.equals("Full-Time")){
            if(program.equals("Undergraduate")){
                programFee = 500;
            }
            else if(program.equals("Graduate")){
                programFee = 750;
            }
            else{
                programFee = 1200;
            }
        }
        else if(status.equals("Part-Time")){
            if(program.equals("Undergraduate")){
                programFee = 300;
            }
            else if(program.equals("Graduate")){
                programFee = 750;
            }
            else{
                programFee = 900;
            }
        }
        else{
            programFee = 150;
        }

        double activityFee = 0;

        if(status.equals("Full-Time")){
            activityFee = 200;
        }
        else if(status.equals("Part-Time")){
            activityFee = 100;
        }
        else{
            activityFee = 50;
        }

        double tuitionCost = creditHours * baseTuition * residencyMultiplier;
        double totalFee = tuitionCost + programFee + activityFee;

        String category;

        if(residency.equals("In-State") && status.equals("Full-Time")){
            category = "Standard";
        }
        else if(status.equals("Continuing-Education")){
            category = "Reduced";
        }
        else{
            category = "Premium";
        }

        System.out.println("Program: " + program);
        System.out.println("Residency: " + residency);
        System.out.println("Status: " + status);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Tuition Cost: " + tuitionCost);
        System.out.println("Program Fee: " + programFee);
        System.out.println("Activity Fee: " + activityFee);
        System.out.println("Total Fee: " + totalFee);
        System.out.println("Category: " + category);
    }
}
