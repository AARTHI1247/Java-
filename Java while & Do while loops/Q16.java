import java.util.*;
import java.util.Scanner;
public class Q16{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
       int sum=0;
       int dig=0;
       int i=0;
        while(a>0){
             dig=a%10;
             sum=sum+(dig*(int)Math.pow(2,i));
             a=a/10;
             i++;
        }
         System.out.println(sum);
    }
}
