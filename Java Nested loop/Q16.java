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
        int ts=r*c;
        int v=ts-n;
        double or=(double)n/ts*100;
         System.out.print("Total Spots:"+ts+"\n"+"Occupied: "+n+"\n"+"Vaccant: "+v+"\n");
           System.out.printf("Occupancy Rate: "+"%.2f%%",or);
    }
}
