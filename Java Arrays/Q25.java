import java.util.*;
public class Q25{     
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
         double ct=av*2;
         int j=0;
         int max=arr[0],min=arr[0];
          for(int i=0;i<n;i++){ 
             if(max<arr[i]){
                 max=arr[i];
             }
             if(min>arr[i]){
                 min=arr[i];
             }
             if(arr[i]>ct){
                 c++;
             }
          }
          int a[]=new int[c];
          for(int i=0;i<n;i++){
              if(arr[i]>ct){
                  a[j++]=i+1;
              }
          }
          System.out.print("Security Events Analyzed: " + n+"\n");
          System.out.print("Average Risk Score: "+String.format("%.2f",av)+"\n");
          System.out.print("Highest Risk Event:"+max +"\n");
          System.out.print("Lowest Risk Event: "+min+"\n");
          System.out.print("Critical Threats (>200% avg): "+c+"\n");
          System.out.print("Threat Threshold: "+String.format("%.2f",ct)+"\n");
          System.out.print("Priority Lines:"+Arrays.toString(a));
}
}
