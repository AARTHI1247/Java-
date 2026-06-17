import java.util.ArrayList;
import java.util.Scanner;
public class Q2 {
    static void main() {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        System.out.print(arr.size());
    }
}
