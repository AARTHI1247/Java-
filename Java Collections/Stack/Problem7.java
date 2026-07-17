import java.util.*;
public class Problem7 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        int n=scan.nextInt();
        s.push(n);
        System.out.print(s.pop());
    }
}
