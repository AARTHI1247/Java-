import java.util.*;
public class Q5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          int n=scan.nextInt();
          double arr[]=new double[n];
          for(int i=0;i<n;i++){
            arr[i]=scan.nextDouble();
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
          double diff=max-min;
          double sv=diff*100/max;
        System.out.print("Number of Sellers: "+n+"\n"+"Lowest Price: $"+String.format("%.2f",min)+"\n"+"Highest Price: $"+String.format("%.2f",max)+"\n"+"Price Difference: $"+String.format("%.2f",diff)+"\n"+"Savings:"+String.format("%.2f%%",sv));
   }
}
