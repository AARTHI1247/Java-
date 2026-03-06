import java.util.*;
import java.util.Scanner;
public class Q5{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int Salary=scan.nextInt();
        int CreditScore=scan.nextInt();
        if(Salary>25000 && CreditScore > 700){
            System.out.println("Approved");
        }
        else{
        System.out.println("Rejected");
        }
    }
}
