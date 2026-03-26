import java.util.*;
public class Q18{     
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
         double sm=av*0.5;
         int in=1;
         int max=arr[0];
          for(int i=0;i<n;i++){
             if(max<arr[i]){
                 max=arr[i];
                 in=i+1;
             }
             if(arr[i]<sm){
                 c++;
             }
          }
          int diff=n-c;
          double pr=(double)diff*100/n;
          System.out.print("Total Products:" + n+"\n");
          System.out.print("Total Units Sold:  "+sum +"\n");
          System.out.print("Average Monthly Sales:"+String.format("%.2f",av)+"\n");
          System.out.print("Best Seller: Product :"+in+"\n");
          System.out.print("Slow-Moving Products:"+c+"\n");
          System.out.print("Turnover Threshold:"+String.format("%.2f",sm)+"\n");
          System.out.print("Clearance Candidates: [");
         int f=1;
         for(int i=0;i<n;i++){
             if(arr[i]<sm){
                 if(f!=c){
                 System.out.print(i+1+", ");
             }
             else{
               System.out.print(i+1); 
             }
             f++;
             }
         }
          System.out.print("]");
}
}
