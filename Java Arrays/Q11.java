import java.util.*;
public class Q11{     
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    
          int n=scan.nextInt();
          double sum=0;
          double q[]=new double[n];
          double v[]=new double[n];
          double p[]=new double[n];
          for(int i=0;i<n;i++){ 
            q[i]=scan.nextDouble();
          }
          for(int i=0;i<n;i++){ 
            p[i]=scan.nextDouble();
          }
          for(int i=0;i<n;i++){
              v[i]=q[i]*p[i];
          }
          int h=0,l=0;
          double max=v[0],min=v[0];
          for(int i=0;i<n;i++){
              sum=sum+v[i];
              if(max<v[i]){
                  max=v[i];
                  h=i;
              }
              if(min>v[i]){
                  min=v[i];
                  l=i;
              }
          }
          System.out.print("Number of Assets:"+n+"\n"+"Total Portfolio Value: $"+String.format("%.2f",sum)+"\n"+"Most Valuable Asset: Asset "+h+" ($"+String.format("%.2f",max)+")"+"\n"+"least Valuable Asset: Asset "+l+" ($"+String.format("%.2f",min)+")") ;
    }
}
