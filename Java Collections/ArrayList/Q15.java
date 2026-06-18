import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class Q15 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
            arr1.add(scan.nextInt());
        }
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(arr.get(i)==arr1.get(j)){
                   System.out.print(arr.get(i)+" ");
                   break;
               }
           }
       }
    }
}
