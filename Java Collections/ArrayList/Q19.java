import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Q19{
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
            if(arr.get(i)%2==0){
                even.add(arr.get(i));
            }
            else{
                odd.add(arr.get(i));
            }
        }
       System.out.println(even);
        System.out.println(odd);
    }
}
