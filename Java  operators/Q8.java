import java.util.*;
import java.util.Scanner;
public class Q5{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age =scan.nextInt();
        int idProof=scan.nextInt();
        if(age>=18 && idProof==1){
            System.out.println("Entry Allowed");
        }
        else{
            System.out.println("Entry Denied");
        }
    }
}
