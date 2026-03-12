import java.util.*;
import java.util.Scanner;
public class Q16{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String result="";
        int cp=0;
        int cf=0;
        int maxs=0;
        int score=0;
        double av=0;
        double totals=0;
            for(int i=0;i<n;i++){
            String student=scan.next();
            int correct=scan.nextInt();
            int wrong=scan.nextInt();
            int unattempted=scan.nextInt();
                score=(correct*4)-(wrong*3)+(unattempted*0);
            if(score>=32){
                result="Pass";
                cp++;
            }
            else{
                result="Fail";
                cf++;
            }
            maxs=Math.max(score,maxs);
            totals=totals+score;
            av=totals/n;
          System.out.println("Student: " +student);
            System.out.println("Correct:" +correct);
            System.out.println("Wrong:"+wrong);
            System.out.println("Unattempted:"+unattempted);
            System.out.println("Score:" +score);
             System.out.println("Result:" +result);
              System.out.println();
            }
             System.out.println("Total Students: " +n);
            System.out.println("Pass Count:" +cp);
            System.out.println("Fail Count:"+cf);
            System.out.println("Class Average:"+av);
            System.out.println("Highest Score:" +maxs);
    }
}
