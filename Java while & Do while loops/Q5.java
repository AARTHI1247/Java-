import java.util.*;
import java.util.Scanner;
public class Q5{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int dig=0,rev=0,temp=a;
       while(a!=0){
           dig=a%10;
           rev=rev*10+dig;
           a=a/10;
       }
       System.out.println("Original: "+temp+"\n"+"Reversed: "+rev);
    }
}
