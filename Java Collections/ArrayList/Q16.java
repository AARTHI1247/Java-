import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Q16 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
            arr1.add(scan.nextInt());
        }
        arr.addAll(arr1);
        Collections.sort(arr);
        int k=0;
       for(int i=0;i<((2*n)-1)-k;i++){
           if(arr.get(i)==arr.get(i+1)){
               arr.remove(i);
               k++;
               i=-1;
           }
       }
       System.out.print(arr);
    }
}
