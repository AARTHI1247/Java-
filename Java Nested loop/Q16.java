import java.util.*;
public class Q16{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r=scan.nextInt();
        int c=scan.nextInt();
        int n=scan.nextInt();
        boolean arr[][]=new boolean[r][c];
        for(int i=1;i<=n;i++){
           int row=scan.nextInt();
           int col=scan.nextInt();
           arr[row][col]=true;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               if(arr[i][j]){
                   System.out.print("[O]");
               }
               else{
                    System.out.print("[ ]"); 
               }
            }
            System.out.println();
        }
    }
}
