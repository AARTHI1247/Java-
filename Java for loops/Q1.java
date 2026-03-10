import java.util.*;
import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int per=0;
        double sum=0.0;
        scan.nextLine();
        for (int i=0;i<n;i++){
            String name=scan.nextLine();
            double sal=scan.nextDouble();
            int r=scan.nextInt();
            scan.nextLine();
            if(r==5){
                per=15;
            }
            else if(r==4){
                per=10;
            }
            else if(r==3){
                per=5;
            }
            else if(r==2){
                per=2;
            }
            else if(r==1){
                per=0;
            }
            double f=sal*(1+per/100.0);
            sum=sum+f;
            System.out.println("Employee:"+name);
            System.out.println("Base Salary: $"+sal);
            System.out.println("Increment:"+per+"%");
            System.out.println("Final Salary: $"+f);
            System.out.println();
        }
        double av=sum/n;
        System.out.println("Total Employees Processed:"+n);
        System.out.println("Total Payroll:"+sum);
        System.out.println("Average Salary:"+av);
    }
}
