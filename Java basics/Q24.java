import java.util.*;
import java.util.Scanner;
public class Q24{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int registration =scan.nextInt();
        int broadcast=scan.nextInt();
        int sponsor=scan.nextInt();
        int prize=scan.nextInt();
        int rent=scan.nextInt();
        int advertising=scan.nextInt();
        int sum=registration+broadcast+sponsor-prize-rent-advertising;
        System.out.println(sum);
    }
}
