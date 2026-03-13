import java.util.*;
import java.util.Scanner;
public class Q2{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int sum=0,i=1,c=0;
       while(i!=0){
           int a=scan.nextInt();
           i=a;
           if(a==0){
               System.out.println("Enter number (0 to stop): "+a);
               break;
           }
           else{
            sum=sum+a;
            System.out.println("Enter number (0 to stop): "+a);
            c++;
           }
           }
           System.out.println("Total Sum "+sum+"\n "+"Count: "+c);
    }
}
