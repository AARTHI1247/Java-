import java.util.*;
public class Q19{     
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
          int target=scan.nextInt();
         double av=(double)sum/n;
         int in=1;
         int max=arr[0];
          for(int i=0;i<n;i++){
             if(max<arr[i]){
                 max=arr[i];
                 in=i+1;
             }
             if(arr[i]<target){
                 c++;
             }
          }
          int diff=n-c;
          double pr=(double)diff*100/n;
          System.out.print("Days Tracked:" + n+"\n");
          System.out.print("Total Calories Burned: "+sum +"\n");
          System.out.print("Average Daily Burn: "+String.format("%.2f",av)+"\n");
          System.out.print("Peak Burn Day: Day"+in+"\n");
          System.out.print("Days Below Target:"+c+"\n");
          System.out.print("Goal Achievement:"+String.format("%.2f%%",pr)+"\n");
          
}
}
