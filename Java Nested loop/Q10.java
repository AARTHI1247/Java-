import java.util.*;
public class Q10{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
         int c=scan.nextInt();
           System.out.println("Price Comparison Matrix:");
           System.out.println("Product Vendor1 Vendor2 Vendor3 BestPrice");
          double arr[][]=new double[r][c];
          double min;
        for(int i=0;i<r;i++){
            String name=scan.next();
            System.out.print(name+" ");
            arr[i][0]=scan.nextDouble();
            min=arr[i][0];
            System.out.print(arr[i][0]);
           for(int j=1;j<c;j++){
            arr[i][j]=scan.nextDouble();
             min=Math.min(min,arr[i][j]);
             System.out.print(arr[i][j]+" ");
           }
            System.out.printf("%.2f",min);
           System.out.println();
        }
    }
}
