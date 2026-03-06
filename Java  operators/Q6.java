import java.util.*;
import java.util.Scanner;
public class Q6{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int familyIncome =scan.nextInt();
        int percentage=scan.nextInt();
        if(familyIncome<200000 && percentage>= 75){
            System.out.println("Granted");
        }
        else{
            System.out.println("Not Granted");
        }
    }
}
