import java.util.*;
public class Q14{     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
          int n=scan.nextInt();
          double arr[]=new double[n];
          double sum=0,c=0;
          for(int i=0;i<n;i++){
              arr[i]=scan.nextDouble();
              sum=sum+arr[i];
          }
         double av=sum/n;
         double pt=av*0.8;
         double max=arr[0];
          for(int i=0;i<n;i++){
             if(max<arr[i]){
                 max=arr[i];
             }
             if(arr[i]<pt){
                 c++;
             }
          }
          System.out.print("Total Plots:"+n+"\n"+"Total Harvest:"+sum+"\n"+"Average Yield: "+String.format("%.2f",av)+" tons/acre"+"\n"+"Highest Yield:"+String.format("%.2f",max)+" tons/acre"+"\n"+"Underperforming Plots:"+c+"\n"+"Performance Threshold: "+String.format("%.2f",pt)+"tons/acre");
    }
}
