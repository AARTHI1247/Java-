import java.util.ArrayList;
import java.util.Scanner;
public class Q11{
    static void main() {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        int in=0,dec=0;
        for(int i=0;i<n-1;i++){
            if(arr.get(i)<arr.get(i+1)){
                in=1;
            }
            else{
                dec=1;
            }
        }
        if(in==1 && dec==1){
            System.out.println("Not Sorted");
            return;
        }
        System.out.println("Sorted");
    }
}
