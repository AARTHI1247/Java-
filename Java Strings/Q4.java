import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
