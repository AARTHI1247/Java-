import java.util.*;
import java.util.Scanner;
public class Q21{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int mul=0;
        int i=1;
       do{
            mul=a*i;
             System.out.println(a+" x "+i+" = "+mul);
            i++;
        } while(i<=b);
    }
}
