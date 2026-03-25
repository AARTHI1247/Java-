import java.util.*;
public class Q15{     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
          int n=scan.nextInt();
          int arr[]=new int[n];
          int sum=0,c=0;
          for(int i=0;i<n;i++){
              arr[i]=scan.nextInt();
              sum=sum+arr[i];
          }
         double av=(double)sum/n;
         int max=arr[0],min=arr[0];
          for(int i=0;i<n;i++){
             if(max<arr[i]){
                 max=arr[i];
             }
            if(min>arr[i]){
                 min=arr[i];
             }
             if(arr[i]>300){
                 c++;
             }
          }
          int diff=n-c;
          double pr=(double)diff*100/n;
          System.out.println("Total Calls: " + n);
          System.out.printf("Average Handling Time:  %.2f  seconds\n", av);
          System.out.printf("Shortest Call:"+min+" seconds\n");
           System.out.printf("Shortest Call:"+max+" seconds\n");
           System.out.printf("Calls Exceeding Target (300s):"+c+"\n");
          System.out.print("Target Compliance:"+String.format("%.2f%%",pr));
    }
}
