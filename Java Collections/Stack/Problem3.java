import java.util.*;
public class ran1 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt(),c=0;
        String str=scan.next();
        Stack<Character> s = new Stack<>();
        for(int i=0;i<n;i++){
        if(!s.contains(str.charAt(i))){
            s.push(str.charAt(i));
            }
        }
        System.out.print(s);
    }
}
