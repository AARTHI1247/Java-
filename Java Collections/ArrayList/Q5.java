import java.util.ArrayList;
import java.util.Scanner;
public class Q5 {
    static void main() {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        for(int i=0;i<n;i++){
              if(arr.get(i)!=0){
                  arr.set(k++,arr.get(i));
              }
        }
        for(int i=k;i<n;i++){
            arr.set(k++,0);
        }
        System.out.println(arr);
    }
}
