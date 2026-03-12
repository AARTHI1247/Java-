import java.util.*;
public class Q9{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int c=0;
       // int td=0;
        int tc=0;
        int td=0;
        int sum=0;
        String intensity="";
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            String type=scan.next();
            int dur=scan.nextInt();
            if(type.equalsIgnoreCase("running")){
                tc=10*dur;
                intensity="High intensity";
            }
            else if(type.equalsIgnoreCase("Swimming")){
                tc=12*dur;
                intensity="High intensity";
            }
            else if(type.equalsIgnoreCase("Cycling")){
                tc=8*dur;
                intensity="Moderate intensity";

            }
            else if(type.equalsIgnoreCase("gym")){
                tc=7*dur;
                intensity="Moderate intensity";

            }
            else if(type.equalsIgnoreCase("walking")){
                tc=4*dur;
                intensity="Low intensity";
            }
            td=td+dur;
            sum=sum+tc;
            System.out.println("Session:"+type);
            System.out.println("duration:"+dur);
            System.out.println("Calories:"+tc);
            System.out.println("Intensity:"+intensity);
            System.out.println();
        }
        double av=sum/n;
        String fit="";
        if(tc<300){
            fit="Beginner";
        }
        else if(tc>300 && tc<=1000){
            fit="Intermediate";
        }
        else if(tc>1000){
            fit="Advanced";
        }
        System.out.println("Total Workouts:"+n);
        System.out.println("Total Duration:"+td);
        System.out.println("Total calories Burned:"+sum);
        System.out.println("Average Calories per Session:"+av);
        System.out.println("Fitness Level:"+fit);
    }
}
