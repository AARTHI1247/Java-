import java.util.*;
public class Q23{     
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
         double pt=av*0.9;
         int j=0,it=1;
         double max=arr[0],min=arr[0];
          for(int i=0;i<n;i++){ 
             if(max<arr[i]){
                 max=arr[i];
                 it=i+1;
             }
             if(arr[i]<pt){
                 c++;
             }
          }
          int a[]=new int[c];
          for(int i=0;i<n;i++){
              if(arr[i]<pt){
                  a[j++]=i+1;
              }
          }
          System.out.print("Production Lines: " + n+"\n");
          System.out.print("Total Output: "+sum+"units\n");
          System.out.print("Average Output:"+String.format("%.2f",av)+"units\n");
          System.out.print("Top Producer: Lines "+it +"\n");
          System.out.print("Underperforming Lines: "+c+"\n");
          System.out.print("Performance Threshold: "+String.format("%.2f",pt)+"units\n");  
          System.out.print("Priority Lines:"+Arrays.toString(a));
}
}
