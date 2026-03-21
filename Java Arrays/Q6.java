import java.util.*;
public class Q6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          int n=scan.nextInt();
          double sum=0;
          int c=0,f=0;
          double arr[]=new double[n];
          for(int i=0;i<n;i++){
            arr[i]=scan.nextDouble();
            sum=sum+arr[i];
          }
          double av=sum/n;
          for(int i=0;i<n;i++){
              if(arr[i]>2*av){
                  c++;
              }
          }
          System.out.print("Total Transactions:"+n+"\n"+ "Average Transaction: $"+av+"\n"+"Suspicious Transactions: "+c+"\n"+"Fraud Alert Indices: [");
          for(int i=0;i<n;i++){
              if(arr[i]>2*av){
                  if(f==1){
                   System.out.print(", "); 
                  }
                  System.out.print(i);
                   f=1;
              }
          }
           System.out.print("]"); 
    }
}
