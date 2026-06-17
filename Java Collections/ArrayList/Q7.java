import java.util.ArrayList;
import java.util.Scanner;
public class Q7 {
    static void main() {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        int min=arr.get(0),s_min=0;
        for(int i=1;i<n;i++){
             if(min>arr.get(i)){
                 s_min=min;
                 min=arr.get(i);
             }
             else if(arr.get(i)<s_min && arr.get(i)>min){
                 s_min=arr.get(i);
             }
        }
        System.out.println(s_min);
    }
}
