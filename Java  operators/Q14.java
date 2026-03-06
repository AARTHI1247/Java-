import java.util.*;
import java.util.Scanner;
public class Q14{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int permissionA =scan.nextInt();
        int permissionB=scan.nextInt();
        int values=permissionA | permissionB;
            System.out.println(values);
    }
}
