import java.util.ArrayList;
import java.util.Scanner;
public class Q1 {
    static void main() {
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>();
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        for(int i=0;i<n;i++){
            System.out.println(arr.get(i));
        }
    }
}
