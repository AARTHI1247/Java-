import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class Q13 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        int k=0;
        if(arr.get(0)!=1){
            k=arr.get(0)-1;
        }
       for(int i=0;i<n;i++){
           if (arr.get(i) != k + 1) {
                   for (int j = arr.get(i - 1) + 1; j < arr.get(i); j++) {
                       System.out.print(j + " ");
                   }
                   k = arr.get(i-1);
               }

       }
    }
}
