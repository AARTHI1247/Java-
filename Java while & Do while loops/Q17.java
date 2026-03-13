import java.util.*;
import java.util.Scanner;
public class Q17{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
       int half=a/2;
       int i=1;
       int sum=0;
        while(i<=half){
               if(a%i==0){
                   sum=sum+i;
               }
               i++;
        }
        if(sum==a){
         System.out.println("Perfect number");}
         else{
          System.out.println("Not a Perfect number");}
    }
}
