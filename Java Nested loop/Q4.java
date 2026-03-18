import java.util.*;
public class Q4 {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int r=scan.nextInt();
      int c=scan.nextInt();
      double av,sum;
      for(int i=1;i<=r;i++){
        String name=scan.next();
        av=0;
        sum=0;
        System.out.print(" "+name+" ");
        for(int j=1;j<=c;j++){
            int m=scan.nextInt();
            sum=sum+m;
            System.out.print(m+" ");
        }
        av=sum/c;
        System.out.printf("%.2f",av);
        System.out.println();
      }
    }
}
