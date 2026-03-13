import java.util.*;
import java.util.Scanner;
public class Q13{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int i=0;
        int pow=1;
       while(i<b){
            pow=pow*a;
            i++;
       }
       System.out.println(pow);
    }
}
