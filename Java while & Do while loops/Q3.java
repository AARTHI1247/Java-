import java.util.*;
import java.util.Scanner;
public class Q3{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int c=1;
        int i=0;
       while(i!=n){
           int a=scan.nextInt();
               i=a;
           if(a>n){
               System.out.println("Too high!");
           }
           else if(a==n){
                System.out.println("Correct Attempt: "+ c);
           }
           else {
                System.out.println("Too Low!");
           }
           c++;
       }
    }
}
