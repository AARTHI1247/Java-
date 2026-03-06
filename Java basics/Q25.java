import java.util.*;
import java.util.Scanner;
public class Q25{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int resUsage  =scan.nextInt();
        int resRate =scan.nextInt();
        int comUsage =scan.nextInt();
        int comRate =scan.nextInt();
        int connection =scan.nextInt();
        int penalty =scan.nextInt();
        int maintenance =scan.nextInt();
        int treatment=scan.nextInt();
        int prod=resUsage*resRate;
        int prod2=comRate*comUsage;
        int sum=prod2+prod+connection+penalty+maintenance+treatment;
        System.out.println(sum);
    }
}
