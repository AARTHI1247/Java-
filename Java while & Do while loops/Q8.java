import java.util.*;
import java.util.Scanner;
public class Q8{ 
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int dig=0,sum=0;
        while(n>0){
           dig=n%10;
           sum=sum+dig;
           n=n/10;
        }
        System.out.println(sum);
    }
}
