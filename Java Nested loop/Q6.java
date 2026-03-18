import java.util.*;
import java.util.Scanner.*;
public class Q6{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
        int c=scan.nextInt();
        int[][] sum=new int[r][c];
        int[][] arr1=new int[r][c];
        int[][] arr2=new int[r][c];
        for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               arr1[i][j]=scan.nextInt();
           }
        }
        for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               arr2[i][j]=scan.nextInt();
           }
        }
        for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               sum[i][j]=arr1[i][j]+arr2[i][j];
           }
        }
        for(int i=0;i<r;i++){
           for(int j=0;j<c;j++){
               System.out.print(sum[i][j]+" ");
           }
           System.out.println();
        }
    }
}
