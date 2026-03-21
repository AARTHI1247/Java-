import java.util.*;
public class Q3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          int n=scan.nextInt();
          int arr[]=new int[n];
          int c=0;
          for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
            if(arr[i]<40){
                c++;
            }
          }
          int max=arr[0],min=arr[0];
          for(int i=1;i<n;i++){
              if(arr[i]>max){
                  max=arr[i];
              }
              if(arr[i]<min){
                  min=arr[i];
              }
          }
          int pass=n-c;
          double per=(double)pass/n*100;
        System.out.print("Total Students: "+n+"\n"+"Highest Score: "+max+"\n"+"Lowest Score: "+min+"\n"+"Failed Students: "+c+"\n"+"Pass Percentage: "+String.format("%.2f%%",per));
   }
}
