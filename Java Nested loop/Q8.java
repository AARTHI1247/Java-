import java.util.*;
import java.util.Scanner.*;
public class Q8{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
         int c=scan.nextInt();
           System.out.println("Attendance Matrix:");
           System.out.println("Student Day1 Day2 Day3 Day4 Day5 Attendance%");
          int co;
         double av;
        for(int i=0;i<r;i++){
            co=0;
            av=0;
            String name=scan.next();
            System.out.print(name+" ");
           for(int j=0;j<c;j++){
             char st=scan.next().charAt(0);
             System.out.print(st+" ");
           if(st=='P'){
               co++;
           }
           }
           av=(double)co/c*100;
            System.out.printf("%.2f%%",av);
           System.out.println();
        }
    }
}
