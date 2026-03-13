import java.util.*;
import java.util.Scanner;
public class Q15{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int c=0;
        System.out.println("Collatz sequence starting from :"+n);
        System.out.print(n+" ");
        do{
            if(n%2==0){
                n=n/2;
                System.out.print(n+" ");
                c++;
            }
            else{
                n=(3*n)+1;
                System.out.print(n+" ");
                c++;
            }
        }while(n!=1);
        System.out.println();
        System.out.println("Steps: "+c);
    }
}
