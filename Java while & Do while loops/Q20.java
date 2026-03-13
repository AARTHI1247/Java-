import java.util.*;
import java.util.Scanner;
public class Q20{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int temp=n;
        int sum=0;
        int dig=0;
        int fact;
        while(n!=0){
            fact=1;
           dig=n%10;
           for(int i=dig;i>0;i--){
           fact=fact*i;
           }
             sum=sum+fact;
           n=n/10;
       }
      if(temp==sum){
          System.out.println("Strong number");
      }
      else{
          System.out.println("Not a Strong number");
      }
    }
}
