import java.util.*;
public class Problem2 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt(),c=0;
        String str=scan.next();
        Stack<Character> s = new Stack<>();
        for(int i=0;i<n;i++){
           if(str.charAt(i)=='(' ||str.charAt(i)=='{'||str.charAt(i)=='['){
               s.push(str.charAt(i));
           }
           else{
               if(str.charAt(i)==')'){
                   char ch=s.pop();
                   if(ch=='('){
                       c++;
                   }
               }
               if(str.charAt(i)=='}'){
                   char ch=s.pop();
                   if(ch=='{'){
                       c++;
                   }
               }
               if(str.charAt(i)==']'){
                   char ch=s.pop();
                   if(ch=='['){
                       c++;
                   }
               }
           }
        }
        if(c==n/2){
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }
}
