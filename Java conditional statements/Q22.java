import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int units = scan.nextInt();
        scan.nextLine();
        String type = scan.nextLine();
        String season = scan.nextLine();
        String payment = scan.nextLine();

        double bill = 0;

        if(type.equals("Residential")){
            if(units <= 100){
                bill = units * 0.10;
            }
            else if(units <= 300){
                bill = (100 * 0.10) + (units - 100) * 0.15;
            }
            else if(units <= 500){
                bill = (100 * 0.10) + (200 * 0.15) + (units - 300) * 0.25;
            }
            else{
                bill = (100 * 0.10) + (200 * 0.15) + (200 * 0.25) + (units - 500) * 0.30;
            }
        }
        else{
            if(type.equals("Commercial")){
                if(units <= 100){
                    bill = units * 0.12;
                }
                else if(units <= 300){
                    bill = (100 * 0.12) + (units - 100) * 0.18;
                }
                else if(units <= 500){
                    bill = (100 * 0.12) + (200 * 0.18) + (units - 300) * 0.25;
                }
                else{
                    bill = (100 * 0.12) + (200 * 0.18) + (200 * 0.25) + (units - 500) * 0.25;
                }
            }
            else{
                if(units <= 100){
                    bill = units * 0.08;
                }
                else if(units <= 300){
                    bill = (100 * 0.08) + (units - 100) * 0.12;
                }
                else if(units <= 500){
                    bill = (100 * 0.08) + (200 * 0.12) + (units - 300) * 0.20;
                }
                else{
                    bill = (100 * 0.08) + (200 * 0.12) + (200 * 0.20) + (units - 500) * 0.20;
                }
            }
        }

        if(season.equals("Summer")){
            bill = bill * 1.15;
        }
        else if(season.equals("Winter")){
            bill = bill * 0.90;
        }

        if(payment.equals("Auto-Pay")){
            bill = bill * 0.95;
        }
        else if(payment.equals("Online")){
            bill = bill * 0.97;
        }

        double avgRate = bill / units;

        System.out.println("Total Bill: $" + bill);
        System.out.println("Average Rate: $" + avgRate);
    }
}
