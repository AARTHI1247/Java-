import java.util.*;
public class Q10{     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
          int n=scan.nextInt();
          int  sum=0,c=0;
          int arr[]=new int[n];
          for(int i=0;i<n;i++){ 
            arr[i]=scan.nextInt();
            sum=sum+arr[i];
            if(arr[i]>200){
                c++;
            }
          }  
          int max=arr[0],min=arr[0];
          for(int i=0;i<n;i++){
              if(max<arr[i]){
                  max=arr[i];
              }
              if(min>arr[i]){
                 min=arr[i]; 
              }
          }
          double av=(double)sum/n;
          int r=n-c;
          double pers=r*100/n;
          System.out.print("Total Stores:"+n+"\n"+"Fastest Response:"+min+"ms"+"\n"+"Slowest Response: "+max+"ms"+"\n"+"Average Response: "+String.format("%.2f",av)+"ms"+"\n"+"Slow Servers (>200ms): "+c+"\n"+"Performance Score:"+String.format("%.2f%%",pers)) ;
    }
}
