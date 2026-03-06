import java.util.*;
import java.util.Scanner;
public class Q5{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int usernameMatch =scan.nextInt();
        int passwordMatch=scan.nextInt();
        int accountLocked =scan.nextInt();
        if(usernameMatch==1 && passwordMatch==1 && accountLocked==0){
            System.out.println(" Success");
        }
        else{
            System.out.println("Failed");
        }
    }
}
