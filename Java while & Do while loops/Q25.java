import java.util.*;
import java.util.Scanner;
public class Q25{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i=1;
        do{
         for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
            i++;
        }while(i<=n); 
    }
}
