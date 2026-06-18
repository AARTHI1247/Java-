import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class Q14 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        int k=0;
        int num=scan.nextInt();
       for(int i=0;i<n-k;i++){
           if(arr.get(i)==num){
               arr.remove(i);
               k++;
               i=-1;
           }
       }
       System.out.print(arr);
    }
}
