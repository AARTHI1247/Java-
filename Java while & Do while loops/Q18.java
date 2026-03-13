import java.util.*;
import java.util.Scanner;
public class Q18{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int tem_a=a,temp_b=b;
        int gcd=0;
        while(a!=b){
           if(a>b){
               a=a-b;
           }
           else{
               b=b-a;
           }
        }
         gcd=a;
         int lcm=(tem_a*temp_b)/gcd;
         System.out.println(lcm);
    }
}
