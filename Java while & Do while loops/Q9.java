import java.util.*;
import java.util.Scanner;
public class Q9{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i=1,c=0;
        while(i<=n){
           if(n%i==0){
               c++;
           }
           i++;
        }
        if(c==2){
             System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
    }
}
