import java.util.*;
import java.util.Scanner;
public class Q4{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int creditLimit  =scan.nextInt();
        int purchaseAmount =scan.nextInt();
        int cardBlocked =scan.nextInt();
        if(purchaseAmount<=creditLimit && cardBlocked==0){
            System.out.println("Approved");
        }
        else{
        System.out.println("Declined");
        }
    }
}
