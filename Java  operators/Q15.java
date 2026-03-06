import java.util.*;
import java.util.Scanner;
public class Q15{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int signalValue  =scan.nextInt();
        int toggleMask=scan.nextInt();
        int values=signalValue ^ toggleMask;
            System.out.println(values);
    }
}
