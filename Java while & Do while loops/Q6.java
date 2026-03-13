import java.util.*;
import java.util.Scanner;
public class Q6{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int bal=scan.nextInt();
        System.out.println("Balance: "+bal);
        int rem=0,i=0;
        do{
        int with=scan.nextInt();
         i=with;
          if(with<bal){
              rem=bal-with;
              System.out.println("Enter withdrawal amount:"+ with);
               System.out.println("Withdrawal successful! Remaining balance: "+ rem);
          }
          else{
               System.out.println("Enter withdrawal amount:"+ with);
               System.out.println("Insufficient funds! Try again.");
          }
           
        }while(i>0 && i<bal);
    }
}
