import java.util.*;
public class Problem8 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            int k=scan.nextInt();
            s.push(k);
        }
        Collections.sort(s);
        System.out.print(s);
    }
}
