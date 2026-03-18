import java.util.*;
import java.util.Scanner.*;
public class Q7{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
        for(int i=1;i<=(r/2)+1;i++){
           for(int j=0;j<(2*i)-1;j++){
             System.out.print("*");
           }
            System.out.println();
        }
        for(int i=1;i<=r/2;i++){
           for(int j=0;j<r-(2*i);j++){
                System.out.print("*");
           }
           System.out.println();
        }
    }
}
