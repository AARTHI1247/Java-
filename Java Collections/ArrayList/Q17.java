import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Q17 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        int target= scan.nextInt();
       for(int i=0;i<n-1;i++){
           for(int j=i+1;j<n;j++){
               if(arr.get(i)+arr.get(j)==target){
                   System.out.println("("+ arr.get(i)+","+arr.get(j)+")");
               }
           }
       }
    }
}
