import java.util.*;
public class Q13{     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
          int n=scan.nextInt();
          int arr[]=new int[n];
          int sum=0;
          for(int i=0;i<n;i++){
              arr[i]=scan.nextInt();
              sum=sum+arr[i];
          }
         double av=(double)sum/n;
         int max=arr[0],oc=0,cr=0;
          for(int i=0;i<n;i++){
             if(max<arr[i]){
                 max=arr[i];
             }
             if(arr[i]>180){
                 cr++;
             } 
             if(arr[i]<=15){
                 oc++;
             } 
          }
          double per=oc*100/n;
          System.out.print("Total Flights:"+n+"\n"+"Average Delay: "+String.format("%.2f",av)+" minutes"+"\n"+"Maximum Delay:"+max+" minutes"+"\n"+"On-Time Flights:"+oc+"\n"+"Compensation Required: "+cr+"\n"+"On-Time Performance:"+String.format("%.2f%%",per));
    }
}
