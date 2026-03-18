import java.util.*;
public class Q9{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int r=scan.nextInt();
        for(int i=1;i<=r;i++){
           for(int j=1;j<=i;j++){
             System.out.print(j);
           }
           for(int j=i-1;j>=1;j--){
                System.out.print(j);
           }
            System.out.println();
        }
    }
}
