import java.util.*;
import java.util.Scanner;
public class Q19{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int rev=0;
        int rem=0;
        int dig=0,bin=0;
        while(n>0){
           rem=n%2;
           rev=rev*10+rem;
           n=n/2;
           }
           
        while(rev>0){
             dig=rev%10;
             bin=bin*10+dig;
             rev=rev/10;
        }
          System.out.println(bin);
    }
}
