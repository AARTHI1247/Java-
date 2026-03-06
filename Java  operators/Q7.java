import java.util.*;
import java.util.Scanner;
public class Q7{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int cartValue=scan.nextInt();
        int premiumMember=scan.nextInt();
        if(cartValue>999 || premiumMember==1){
            System.out.println("Free Shipping");
        }
        else{
            System.out.println("Shipping Charges Applied");
        }
    }
}
