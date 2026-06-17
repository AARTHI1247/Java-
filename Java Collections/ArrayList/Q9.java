import java.util.ArrayList;
import java.util.Scanner;
public class Q9 {
    static void main() {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        int last=arr.remove(arr.size()-1);
        int s_last=arr.remove(arr.size()-1);
        arr.add(0,last);
        arr.add(1,s_last);
        System.out.println(arr);
    }
}
