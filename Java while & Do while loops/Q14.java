import java.util.*;
import java.util.Scanner;
public class Q14{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int temp=n;
        int bin=n;
        int c=0,dig=0,sum=0;
       while(bin>0){
           bin=bin/10;
           c++;
       }
       while(n>0){
           dig=n%10;
           sum=sum+(int)Math.pow(dig,c);
           n=n/10;
       }
       if(sum==temp){
           System.out.println(temp+" is an Armstrong number");
       }
       else{
          System.out.println(temp+" is not an Armstrong number");
       }
    }
}
