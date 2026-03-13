import java.util.*;
import java.util.Scanner;
public class Q12{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int temp=a;
        int dig=0,rev=0;
       while(a!=0){
           dig=a%10;
           rev=rev*10+dig;
           a=a/10;
       }
       if(temp==rev){
           System.out.println(temp+" is palindrome");
       }
       else{
       System.out.println(temp+" is not palindrome");
        }
    }
}
