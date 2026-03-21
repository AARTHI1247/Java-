import java.util.*;
public class Q8{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          int n=scan.nextInt();
          int sum=0,c=0;
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
            sum=sum+arr[i];
          }
          int max=arr[0];
          double av=(double)sum/n;
          for(int i=0;i<n;i++){
              if(arr[i]>max){
                  max=arr[i];
              }
               if(arr[i]>60){
                  c++;
              }
          }
          int s=n-c;
          double per=(double)s*100/n;
          System.out.print("Total Patients: "+n+"\n"+ "Longest Wait Time: "+max+" minutes"+"\n"+"Average Wait Time:"+String.format("%.2f",av)+" minutes"+"\n"+"Patients Waiting >60 min:"+c+"\n"+"Service Level: "+String.format("%.2f%%",per));
         
    }
}
