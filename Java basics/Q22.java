import java.util.*;
import java.util.Scanner;
public class Q22{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int copies   =scan.nextInt();
        int cost =scan.nextInt();
        int editing =scan.nextInt();
        int design  =scan.nextInt();
        int commission =scan.nextInt();
        int marketing=scan.nextInt();
        int prod=copies*cost;
        int sum=prod+editing+design-commission -marketing;
        System.out.println(sum);
    }
}
