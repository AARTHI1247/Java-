import java.util.*;
import java.util.Scanner.*;
public class Q2 {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int r=scan.nextInt();
      int c=scan.nextInt();
      System.out.println();
      for(int i=1;i<=r;i++){
          System.out.print("Row"+" "+i+":"+" ");
          for(int j=1;j<=c;j++){
             System.out.print("Seat-"+j+" ");
          }
      System.out.println();
      }
    }
}
