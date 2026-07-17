import java.util.*;
public class Problem6{
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        Stack<Integer> s = new Stack<>();
        while(n>0){
            int rem=n%2;
            s.push(rem);
            n/=2;
        }
        while(!s.empty()){
            System.out.print(s.pop());
        }
    }
}
