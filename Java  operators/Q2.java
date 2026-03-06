import java.util.*;
import java.util.Scanner;
public class Q2{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int accountBalance=scan.nextInt();
        int withdrawalAmount=scan.nextInt();
        int dailyLimit=scan.nextInt();
        if(withdrawalAmount>accountBalance|| withdrawalAmount>dailyLimit){
            System.out.println("Declined ");
        }
        else{
        System.out.println("Approved");
        }
    }
}
