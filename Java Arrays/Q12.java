import java.util.*;
public class Q12{     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
          int n=scan.nextInt();
          double sum=0;
          int index=0;
          double a[]=new double[n];
          for(int i=0;i<n;i++){ 
            a[i]=scan.nextDouble();
            sum=sum+a[i];
          }
          double dl=scan.nextDouble();
          double max=a[0],av=0,diff=0;
          av=sum/n;
          for(int i=0;i<n;i++){
              if(max<a[i]){
                  max=a[i];
                  index=i;
              }
          }
          System.out.print("Hours Monitored: "+n+"\n"+"Total Daily Consumption: "+String.format("%.2f",sum)+"kWh"+"\n"+"Peak Hour: Hour"+index+" ("+String.format("%.2f",max)+"kWh)"+"\n"+"Average Hourly:"+String.format("%.2f",av)+"kWh"+"\n"+"Daily Limit: "+String.format("%.2f",dl)+"kWh"+"\n") ;
            if(sum>dl){
             diff=sum-dl;
             System.out.print("Status:"+diff);
          }
          else{
            System.out.print("Status:Within limit"); 
          }
    }
}
