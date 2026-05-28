import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int n = a.length();
        int c = 0, l = 0, nm = 0, s = 0;
        if (n >= 8) {
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                    c = 1;
                }
                if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                    l = 1;
                }
                if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                    nm = 1;
                }
                if (!((a.charAt(i) >= '0' && a.charAt(i) <= '9') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z'))) {
                    s = 1;
                }
            }
        }
            if (c != 0 && l != 0 && nm != 0 && s != 0) {
            System.out.print("Strong");
        }

        else {
            System.out.print("weak");
        }
    }
}
