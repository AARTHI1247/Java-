import java.util.ArrayList;
import java.util.Scanner;
public class Q10 {
    static void main() {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        int first=arr.remove(0);
        int s_first=arr.remove(0);
        arr.add(arr.size(),first);
        arr.add(arr.size(),s_first);
        System.out.println(arr);
    }
}
