import java.util.*;
import java.util.Scanner;
public class Q10{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a+" "+b+" ");
        int i=2;
        while(i<n){
            c=a+b;
            a=b;
            b=c;
            i++;
       System.out.print(b+" ");
       }
    }
}
