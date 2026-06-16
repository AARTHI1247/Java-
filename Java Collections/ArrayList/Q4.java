import java.util.ArrayList;
import java.util.Scanner;
public class random {
    static void main() {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        if(n==1){
            System.out.println(arr.get(0));
            return;
        }
        ArrayList<Integer> arr1=new ArrayList<>();
        for(int i=0;i<n;i++){
                if(i==n-1 && (arr.get(i)!=arr.get(i-1))){
                    arr1.add(arr.get(i));
                }
                else {
                    if(arr.get(i)!=arr.get(i+1)){
                        arr1.add(arr.get(i));
                    }
                }
        }
        System.out.println(arr1);
    }
}
