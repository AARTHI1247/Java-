import java.util.*;
public class Q17{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r= scan.nextInt();
        int c= scan.nextInt();
       for(int i=1;i<=r;i++){
          if(i==1 || i==r){
           for(int j=1;j<=c;j++){
                   System.out.print("*");
               }
                System.out.println();
            }
             else{
                  for(int j=1;j<=2;j++){
                   System.out.print("* ");
               }
                System.out.println();
              }
           }
    }
}
