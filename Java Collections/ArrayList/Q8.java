import java.util.ArrayList;
import java.util.Scanner;
public class Q8 {
    static void main() {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }

        for(int i=0;i<=n/2;i++){
            int temp=arr.get(i);
             arr.set(i,arr.get(n-1-i));
             arr.set(n-1-i,temp);
        }
        System.out.println(arr);
    }
}
