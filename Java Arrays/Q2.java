import java.util.*;
public class Q2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          int n=scan.nextInt();
          int m=scan.nextInt();
          int c=0;
          int arr[]=new int[n];
          for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
            if(arr[i]<m){
                c++;
            }
          }
        System.out.print("Total Products: "+n+"\n"+"Minimum Threshold: "+m+"\n"+"Low Stock Products: "+c+"\n"+"Product Indices: [");
        int f=0;
        for(int i=0;i<n;i++){
            if(arr[i]<m){
                if(f==1){
                   System.out.print(", ");  
                }
               System.out.print(i);
               f=1;
            }
        }
         System.out.print("]");
   }
}
