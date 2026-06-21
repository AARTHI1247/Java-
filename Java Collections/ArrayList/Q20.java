import javax.swing.text.SimpleAttributeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class ran1 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
            if(i==n-1){
                a.add(arr.get(i));
            }
        }
        int max=arr.get(n-1);
        for(int i=n-2;i>=0;i--){
             if(arr.get(i)>max){
                a.add(arr.get(i));
                max=arr.get(i);
             }
        }for(int i=a.size()-1;i>=0;i--){
        System.out.print(a.get(i)+" ");}
    }
}
