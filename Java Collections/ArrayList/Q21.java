import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q21 {
    static void main() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(scan.nextInt());
        }
        Collections.sort(arr);
        int k=0;
        for(int i=0;i<n-1-k;i++){
            if(arr.get(i)==arr.get(i+1)){
                arr.remove(i);
                k++;
                i=0;
            }
        }
        int c=1,j=1;
        for(int i=0;i<arr.size()-1;i++) {
            if (arr.get(i) == arr.get(i + 1) - 1) {
                c++;
                j=Math.max(j,c);
            } else {
                if (c > j) {
                    j = c;
                }
                c = 1;
            }
        }
        System.out.print(j);}
    }
