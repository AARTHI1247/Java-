import java.util.*;
import java.util.Scanner;
public class Q3{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int workingHours =scan.nextInt();
        int attendancePercentage=scan.nextInt();
        if(workingHours>40 && attendancePercentage>90){
            System.out.println(" Eligible ");
        }
        else{
        System.out.println(" Not Eligible");
        }
    }
}
