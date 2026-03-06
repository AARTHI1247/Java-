import java.util.*;
import java.util.Scanner;
public class Q1{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a =scan.nextInt();
        int b =scan.nextInt();
        int av =(a+b)/2;
        if(a>=50 && b>=50 && av>=60){
            System.out.println("PAss");
        }
        else{
        System.out.println("FAIL");
        }
    }
}
