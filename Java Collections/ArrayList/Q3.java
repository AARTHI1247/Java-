import java.util.ArrayList;
import java.util.Scanner;
public class Q3 {
    static void main() {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        System.out.println(arr.get(0));
        System.out.print(arr.get(n-1));
    }
}
