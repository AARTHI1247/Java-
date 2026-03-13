import java.util.*;
import java.util.Scanner;
public class Q1{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String n=scan.next();
        int c=3;
       while(c>0){
           String a=scan.next();
           if(n.equals(a)){
               System.out.println("Enter password: "+"\n"+"Access granted!");
           }
           else{
            c--;
            System.out.println("Enter password: "+"\n"+"Incorrect! Attempts remaining:"+ c);
           }
           }
    }
}
