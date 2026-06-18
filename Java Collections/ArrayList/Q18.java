import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Q18 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
       for(int i=0;i<=n/2;i++){
           if(arr.get(i)!=arr.get(n-1-i)){
               System.out.print("Not Palindrome");
               return;
           }
       }
       System.out.println("Palindrome");
    }
}
