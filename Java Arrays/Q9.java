import java.util.*;
public class Q9{     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
          int n=scan.nextInt();
          double sum=0;
          double arr[]=new double[n];
          for(int i=0;i<n;i++){ 
            arr[i]=scan.nextDouble();
            sum=sum+arr[i];
          }  
          double max=arr[0],min=arr[0];
          for(int i=0;i<n;i++){
              if(max<arr[i]){
                  max=arr[i];
              }
              if(min>arr[i]){
                 min=arr[i]; 
              }
          }
          double av=sum/n;
          System.out.print("Total Stores:"+n+"\n"+"Highest Sales: $"+String.format("%.2f",max)+"\n"+"Lowest Sales: $"+String.format("%.2f",min)+"\n"+"Total Sales: $"+String.format("%.2f",sum)+"\n"+"Average Sales: $"+String.format("%.2f",av));
    }
}
