import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q22 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int[]left = new int[n];
        int[]right = new int[n];
        int[]ans = new int[n];
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
       left[0]=arr.get(0);
        right[n-1]=arr.get(n-1);
        for(int i=1;i<n;i++){
            left[i]=arr.get(i)*left[i-1];
        }
        for(int i=n-2;i>=0;i--){
            right[i]=arr.get(i) * right[i+1];
        }
        ans[0]=right[1];
        ans[n-1]=left[n-2];
        for(int i=1;i<n-1;i++) {
            ans[i]=left[i-1]*right[i+1];
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]);
        }

    }
}
