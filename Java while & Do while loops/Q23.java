import java.util.*;
import java.util.Scanner;
public class Q23{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
       String a=scan.nextLine();
       int c=0;
       int len=a.length();
       int i=0;
        do{
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'||a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='O'||a.charAt(i)=='I'||a.charAt(i)=='U'){
                c++;
            }
            i++;
        }while(i<len);
       System.out.println(c);
    }
}
