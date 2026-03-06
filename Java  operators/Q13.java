import java.util.*;
import java.util.Scanner;
public class Q13{ 
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int connectionValue=scan.nextInt();
        int applianceMask=scan.nextInt();
        int values=connectionValue & applianceMask;
        if(values==applianceMask){
            System.out.println("Active");

        }
        else{
            System.out.println("Inactive");
        }
    }
}
