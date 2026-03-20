import java.util.*;
public class Q14{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          int row=scan.nextInt();
          int col=scan.nextInt();
          int n=scan.nextInt();
          int c=1;
          int n1=row*col;
          int em=n1-n;
          for(int i=1;i<=n1;i++){
              for(int j=1;j<=col;j++){
                  if((i+j)%2==0 && c<=n){
                      System.out.print("S" + String.format("%03d", c) + " ");
                  c++;
                  }
                  else{
                      System.out.print("----"+" ");
                  }
              }
               System.out.println();
          }
          System.out.print("Total Seats:"+n1+"\n"+"Occupied Seats: "+n+"\n"+"Empty Seats: "+em);
        }
}
