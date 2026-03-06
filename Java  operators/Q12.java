import java.util.*;
import java.util.Scanner;
public class Q12{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int fileSize =scan.nextInt();
        int compressionCycles=scan.nextInt();
        int values=fileSize>>compressionCycles;
        System.out.println(values);
    }
}
