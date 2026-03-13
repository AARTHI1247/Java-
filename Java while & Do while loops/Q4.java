import java.util.*;
import java.util.Scanner;
public class Q4{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int fact=1,i=a;
       while(i>0){
           fact=fact*i;
           i--;
       }
       System.out.println("Factorial of "+a+" "+fact);
    }
}
