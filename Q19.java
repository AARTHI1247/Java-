import java.util.*;
import java.util.Scanner;
public class Q19{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int days =scan.nextInt();
        int rent  =scan.nextInt();
        int late =scan.nextInt();
        int fuel =scan.nextInt();
        int maintenance=scan.nextInt();
        int prod=days*rent;
        int sum=prod+late+-fuel-maintenance;
        System.out.println(sum);
    }
}
