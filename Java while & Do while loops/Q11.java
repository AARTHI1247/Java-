import java.util.*;
import java.util.Scanner;
public class Q11{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
         int b=scan.nextInt();
       while(a!=b){
       if(a>b){
           a=a-b;
       }
       else{
            b=b-a;
        }
       }
       System.out.println(a);
    }
}
