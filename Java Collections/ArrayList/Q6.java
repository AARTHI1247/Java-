import java.util.ArrayList;
import java.util.Scanner;
public class Q6 {
    static void main() {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        int max=arr.get(0),s_max=0;
        for(int i=1;i<n;i++){
             if(max<arr.get(i)){
                 s_max=max;
                max=arr.get(i);
             }
             else if(arr.get(i)>s_max && arr.get(i)<max){
                 s_max=arr.get(i);
             }
        }
        System.out.println(s_max);
    }
}
