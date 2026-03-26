import java.util.*;
public class Q20{     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
          int n=scan.nextInt();
          int arr[]=new int[n];
          int sum=0;
          int c=0;
          for(int i=0;i<n;i++){
              arr[i]=scan.nextInt();
              sum=sum+arr[i];
          }
         double av=(double)sum/n;
         int in=1;
         int max=arr[0],min=arr[0];
          for(int i=0;i<n;i++){
             if(max<arr[i]){
                 max=arr[i];
                 in=i+1;
             }
             if(min>arr[i]){
                 min=arr[i];
                 in=i+1;
             }
             if(arr[i]<60){
                 c++;
             }
          }
          int diff=n-c;
          double pr=(double)diff*100/n;
          System.out.print("Total Students: " + n+"\n");
          System.out.print("Average Completion:"+String.format("%.2f%%",av)+"\n");
          System.out.print("Highest Completion:"+max+"%\n");
          System.out.print("Lowest Completion:"+min +"%\n");
          System.out.print("At-Risk Students (<60%):"+c+"\n");
          System.out.print("Success Rate:"+String.format("%.2f%%",pr)+"\n");
          
}
}
