import java.util.*;
public class Q15{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
         System.out.print("Star Rating Matrix:"+"\n"+"Product Rating Stars"+"\n");
         double sum=0;
        for(int i=1;i<=n;i++){
          String name=scan.next();
          double rate=scan.nextDouble();
          int cn=(int)rate;
          int v=5-cn;
           System.out.print(name+" " +rate);
           for(int j=0;j<cn;j++){
                System.out.print(" ★ ");}
            for(int j=0;j<v;j++){
                System.out.print(" ☆ ");}
            System.out.println();
            sum=sum+rate;
           }
           double av=sum/n;
           System.out.print("Average Rating: "+av);
     }
}
