import java.util.*;
import java.util.Scanner;
public class Q10{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int unitsConsumed  =scan.nextInt();
        int voltageFluctuation=scan.nextInt();
       // int accountLocked =scan.nextInt();
        if(unitsConsumed>500 || voltageFluctuation==1){
            System.out.println("Alert Triggered");
        }
        else{
            System.out.println("Normal Usage");
        }
    }
}
