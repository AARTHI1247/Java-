import java.util.*;
public class Q24{     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
          int n=scan.nextInt();
          double arr[]=new double[n];
          double sum=0;
          int cb=0,cp=0;
          for(int i=0;i<n;i++){
              arr[i]=scan.nextDouble();
              sum=sum+arr[i];
          }
         double av=sum/n;
         double bp=av*0.7;
         double pp=av*1.5;
         int j=0;
         double max=arr[0],min=arr[0];
          for(int i = 0; i < n; i++){ 
             if(max<arr[i]){
                 max=arr[i];
             }
             if(min>arr[i]){
                 min=arr[i];
             }
             if(arr[i]<bp){
                 cb++;
             }
             if(arr[i]>pp){
                 cp++;
             }
          }
          System.out.print("Total Properties: " +n+"\n");
          System.out.print("Portfolio Value: $"+String.format("%.2f",sum)+"\n");
          System.out.print("Average Property Value: $"+String.format("%.2f",av)+"\n");
          System.out.print("Most Valuable: $"+String.format("%.2f",max)+"\n");
          System.out.print("Least Valuable: $"+String.format("%.2f",min) +"\n");
          System.out.print("Bargain Properties (<70% avg):"+cb+"\n");
          System.out.print("Premium Properties (>150% avg):"+cp+"\n");
}
}
