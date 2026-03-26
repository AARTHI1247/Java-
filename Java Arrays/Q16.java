import java.util.*;
public class Q16{     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
          int n=scan.nextInt();
          int arr[]=new int[n];
          int sum=0,c=0;
          for(int i=0;i<n;i++){
              arr[i]=scan.nextInt();
              sum=sum+arr[i];
          }
         double av=(double)sum/n;
         double per=av*1.5;
         int max=arr[0],in=1;
          for(int i=0;i<n;i++){
             if(max<arr[i]){
                 max=arr[i];
                 in=i;
             }
            if(arr[i]>per){
                 c++;
             }
          }
        int f=1;
          int diff=n-c;
          double pr=(double)diff*100/n;
          System.out.print("Trading Days Analyzed: " + n+"\n");
          System.out.print("Total Volume:"+sum+"\n");
          System.out.print("Average Daily Volume:"+ av+"\n");
          System.out.print("Peak Volume Day: Day"+in+"\n");
          System.out.print("High Volume Days "+c+"\n");
          System.out.print("Breakout Signal Days: [");
         for(int i=0;i<n;i++){
             if(arr[i]>per){
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
