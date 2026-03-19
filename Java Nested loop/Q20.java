import java.util.*;
public class Q20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int [][]arr=new int[r][c];
        int [][]arr2=new int[r][c];
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
               arr[i][j]=scan.nextInt();
            }
        }
         for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
              arr2[j][i]=arr[i][j];
         }
    }
                System.out.println("Original Matrix("+ r+"x"+c+ "):");
         for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
              System.out.print(arr[i][j]+" ");
            }
               System.out.println();
         }
         System.out.println();
                System.out.println("Transposed Matrix ("+r +"x"+c+"):");
            for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
              System.out.print(arr2[i][j]+" ");
            }
               System.out.println();
         }
    }
}
