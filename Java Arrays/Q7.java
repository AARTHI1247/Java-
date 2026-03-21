import java.util.*;
public class Q7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          int n=scan.nextInt();
          int t=scan.nextInt();
          int c=0,f=0;
          double arr[]=new double[n];
          for(int i=0;i<n;i++){
            arr[i]=scan.nextDouble();
          }
          for(int i=0;i<n;i++){
              if(arr[i]>t){
                  c++;
              }
          }
          System.out.print("Production Lines: "+n+"\n"+ "Acceptable Threshold: "+t+"\n"+"Lines Exceeding Threshold: "+c+"\n"+"Critical Lines: [");
          for(int i=0;i<n;i++){
              if(arr[i]>t){
                  if(f==1){
                   System.out.print(", "); 
                  }
                  System.out.print(i);
                   f=1;
              }
          }
          int d=n-c;
           System.out.print("]"+"\n");
           double cr=((double)d/n)*100;
           System.out.print("Compliance Rate:"+String.format("%.2f%%",cr));
    }
}
