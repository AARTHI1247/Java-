import java.util.*;
public class Q4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          int n=scan.nextInt();
          double arr[]=new double[n];
          double sum=0;
          for(int i=0;i<n;i++){
            arr[i]=scan.nextDouble();
           sum=sum+arr[i];
          }
          double max=arr[0],min=arr[0];
          for(int i=1;i<n;i++){
              if(arr[i]>max){
                  max=arr[i];
              }
              if(arr[i]<min){
                  min=arr[i];
              }
          }
          double range=max-min;
          double av=sum/n;
        System.out.print("Number of Readings: "+n+"\n"+"Maximum Temperature: "+max+"C"+"\n"+"Minimum Temperature: "+min+"C"+"\n"+"Temperature Range: "+range+"C"+"\n"+"Average Temperature: "+av+"C");
   }
}
