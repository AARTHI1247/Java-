import java.util.*;
public class Q17{     
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
         double max=arr[0],min=arr[0];
          for(int i=0;i<n;i++){
             if(max<arr[i]){
                 max=arr[i];
             }
            if(min>arr[i]){
                  min=arr[i];
             }
             if(arr[i]>8.5 ||arr[i]< 6.5 ){
                 c++;
             }
          }
          int diff=n-c;
          double pr=(double)diff*100/n;
          System.out.print("Total Samples:" + n+"\n");
          System.out.print("Average pH: "+String.format("%.2f",av) +"\n");
          System.out.print("Minimum pH:"+ String.format("%.2f",min)+"\n");
          System.out.print("Maximum pH:"+String.format("%.2f",max)+"\n");
          System.out.print("Unsafe Samples:"+c+"\n");
          System.out.print("Safety Compliance: "+String.format("%.2f",pr)+"\n");
          System.out.print("Breakout Signal Days: [");
         int f=1;
         for(int i=0;i<n;i++){
             if(arr[i]>8.5 || arr[i]<6.5){
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
