import java.util.*;
public class Problem4 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt(),k=0;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
             k=scan.nextInt();
            s.push(k);
        }
        for(int i=0;i<n;i++) {
            System.out.print(s.pop()+" ");
        }
    }
}
