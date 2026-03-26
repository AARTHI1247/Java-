import java.util.*;
public class Q21{     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
          int n=scan.nextInt();
          double arr[]=new double[n];
          double sum=0;
          int c=0;
          for(int i=0;i<n;i++){
              arr[i]=scan.nextDouble();
              sum=sum+arr[i];
          }
         double av=sum/n;
         double ef=av*0.8;
         int j=0;
         
         double max=arr[0],min=arr[0];
          for(int i=0;i<n;i++){ 
             if(max<arr[i]){
                 max=arr[i];
             }
             if(min>arr[i]){
                 min=arr[i];
             }
             if(arr[i]<ef){
                 c++;
             }
          }
          int a[]=new int[c];
          for(int i=0;i<n;i++){
              if(arr[i]<ef){
                  a[j++]=i+1;
              }
          }
          int diff=n-c;
          double pr = (double) diff * 100 / n;
          System.out.print("Fleet Size:" + n+"\n");
          System.out.print("Average Fuel Efficiency:"+String.format("%.2f",av)+" MPG\n");
          System.out.print("Most Efficient:"+max+"MPG\n");
          System.out.print("Least Efficient: "+min +"MPG\n");
          System.out.print("Underperforming Vehicles:"+c+"\n");
          System.out.print("Efficiency Threshold:"+String.format("%.2f",ef)+"MPG\n");  
          System.out.print("Maintenance Priority:"+Arrays.toString(a));
}
}
