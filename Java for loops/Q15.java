import java.util.*;
public class Q15{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int rate=0;
        double basefare=3.0;
        double disc=0;
        double totalfare=0;
        double td=0;
        double tr=0;
        double totald=0;
            for(int i=0;i<n;i++){
            double distance=scan.nextDouble();
            String time=scan.next();
            totald=totald+distance;
            disc=distance*1.00;
            if(time.equalsIgnoreCase("Morning")){
                rate=0;
            }
            else  if(time.equalsIgnoreCase("Afternoon")){
                rate=0;
            }
            else  if(time.equalsIgnoreCase("Evening")){
                rate=3;
            }
            else  if(time.equalsIgnoreCase("Night")){
                rate=5;
            }
            totalfare=basefare+disc+rate;
            td=td+distance;
            tr=totalfare;
            System.out.println("Distance:" + distance);
            System.out.println("Time: " +time);
            System.out.println("Base Fare: $"+basefare);
            System.out.println("Distance Charge: $" +disc);
             System.out.println("Time Surcharge: $ " +rate);
             System.out.println("Total Fare: $" +totalfare);
            System.out.println();
        }
        double av=tr/n;
        System.out.println("Total Rides:" +n);
        System.out.println("Total Distance:" +totald);
        System.out.println("Total Revenue: $"+tr);
        System.out.println("Average Fare: $"+av);
    }
}
