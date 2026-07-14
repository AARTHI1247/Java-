import java.util.Scanner;
import java.util.Stack;
public class Problem1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str= scan.next();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(stack.pop());
        }
    }
}
