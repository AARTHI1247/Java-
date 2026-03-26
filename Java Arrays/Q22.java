import java.util.*;
public class Q22{     
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
         double vt=av*2;
         int j=0;
         
         double max=arr[0],min=arr[0];
          for(int i=0;i<n;i++){ 
             if(max<arr[i]){
                 max=arr[i];
             }
             if(min>arr[i]){
                 min=arr[i];
             }
             if(arr[i]>vt){
                 c++;
             }
          }
          int a[]=new int[c];
          for(int i=0;i<n;i++){
              if(arr[i]>vt){
                  a[j++]=i+1;
              }
          }
          System.out.print("Total Posts:" + n+"\n");
          System.out.print("Average Engagement: "+String.format("%.2f",av)+"%\n");
          System.out.print("Peak Engagement:"+String.format("%.2f",max)+"%\n");
          System.out.print("Lowest Engagement: "+String.format("%.2f",min) +"MPG\n");
          System.out.print("Viral Posts (>200% avg):"+c+"\n");
          System.out.print("Viral Threshold:"+String.format("%.2f",vt)+"MPG\n");  
          System.out.print("Top Performers: "+Arrays.toString(a));
}
}
