import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          int n=scan.nextInt();
          double sum=0;
          int c=0;
          double arr[]=new double[n];
          for(int i=0;i<n;i++){
                  arr[i]=scan.nextDouble();
              sum=sum+arr[i];
        }
        double av=sum/n;
        for(int i=0;i<n;i++){
            if(arr[i]>av){
                c++;
            }
        }
        double per=(double)c/n*100;
        System.out.print("Total Employees: "+n+"\n"+"Average Salary: "+String.format("%.2f",av)+"\n"+"Employees Above Average: "+c+"\n"+"Percentage: "+String.format("%.2f%%",per));
}
}
