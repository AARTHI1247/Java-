import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class random {
    static void main() {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        for(int i=0;i<n;i++){
            arr1.add(scan.nextInt());
        }
        arr.addAll(arr1);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
