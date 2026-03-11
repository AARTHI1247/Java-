import java.util.*;
import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        float sum=0;
        int max=0;
        int pc=0,fc=0;
        String grade="";        
        String status="";
        for (int i=0;i<n;i++){
            String name=scan.next();
            int score=scan.nextInt();
            if(score>=85 && score<100 ){
                grade="A";
            }
            if(score>=70 && score<84 ){
                grade="B";
            }
            else if(score>=60 && score<69 ){
                grade="C";
            }
            else if(score>=50 && score<59 ){
                grade="D";
            }
            else if(score>0 && score<49 ){
                grade="F";
            }
            if(score>=60){
                status="Pass";
                pc++;
            }
            else if(score<60 ){
                status="Fail";
                fc++;
            }
            sum=sum+score;
            max=Math.max(max,score);
            System.out.println("Student:"+name);
            System.out.println("Score:"+score);
            System.out.println("Letter Grade:"+grade);
            System.out.println("Status:"+status);
            System.out.println();
    }
    float avg=sum/n;
        System.out.println("Total Students:"+n);
        System.out.println("Class Average"+avg);
        System.out.println("Highest Score:"+max);
        System.out.println("Students Passed:"+pc);
        System.out.println("Students Failed:"+fc);
}
}
