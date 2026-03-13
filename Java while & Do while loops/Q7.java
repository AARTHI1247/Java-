import java.util.*;
import java.util.Scanner;
public class Q7{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int v=0;
        int i=0;
        do{
           int c=scan.nextInt();
           i=c;
           if(c==5){
               System.out.println("Goodbye!");
               break;
           }
           int a=scan.nextInt();
           int b=scan.nextInt();
            System.out.println("Choice: "+c);
            System.out.println("Enter two numbers: "+a+" "+b);
           
           if(c==1){
               v=a+b;
                System.out.println("Result: "+v);
           }
           else if(c==2){
               v=a-b;
                System.out.println("Result: "+v);
           }
            else if(c==3){
               v=a*b;
                System.out.println("Result: "+v);
           }
            else if(c==4){
                if(b!=0){
                    v=a/b;
                     System.out.println("Result: "+v);
                }
           }
           else if(c==5){
               System.out.println("Goodbye!");
           }
        }while(i!=5);
    }
}
