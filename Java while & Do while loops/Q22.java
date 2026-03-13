import java.util.*;
import java.util.Scanner;
public class Q22{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int sum=0;
        int i=a;
        while(i<=b){
            if(i%2==0){
               sum=sum+i;
            }
            i++;
        }
       System.out.println(sum);
    }
}
