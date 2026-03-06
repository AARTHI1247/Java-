import java.util.*;
import java.util.Scanner;
public class Q11{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int baseBoxes=scan.nextInt();
        int levels=scan.nextInt();
        int values=baseBoxes<<levels;
        System.out.println(values);
    }
}
