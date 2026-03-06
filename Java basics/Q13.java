import java.util.*;
import java.util.Scanner;
public class Q13{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int yieldPerAcre  =scan.nextInt();
        int acres   =scan.nextInt();
        int extraYield   =scan.nextInt();
        int damagedCrops  =scan.nextInt();
        int prod=yieldPerAcre*acres;
        int sum=prod+extraYield-damagedCrops;
        System.out.println(sum);
    }
}
