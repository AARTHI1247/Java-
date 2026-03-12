import java.util.*;
public class Q11{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int cost=0;
        double fee=0;
        int c=0;
        double finalfee=0;
        double dailycap=0;
        double totalrev=0;
         for(int i=0;i<n;i++){
            String veh=scan.next();
            double hr=scan.nextDouble();
            if(veh.equalsIgnoreCase("Car")){
                cost=3;
                fee=hr*cost;
                dailycap=30;
            }
            else if(veh.equalsIgnoreCase("Motorcycle")){
                cost=2;
                fee=hr*cost;
                dailycap=20;

            }
            else if(veh.equalsIgnoreCase("Truck")){
                cost=5;
                fee=hr*cost;
                 dailycap=60;
            }
              else if(veh.equalsIgnoreCase("Bus")){
                cost=7;
                fee=hr*cost;
                 dailycap=100;
            }
            System.out.println(cost);
            
            finalfee=Math.min(fee,dailycap);
            if(hr>8){
                c++;
            }
            totalrev=totalrev+finalfee;
            
            System.out.println("Vehicle 1:" +veh);
            System.out.println("Hours Parked: " +hr);
            System.out.println("Hourly Rate: $" +cost);
            System.out.println("Parking Fee: $" +fee);
            // System.out.println("Cap Applied:" +app);
             System.out.println();
        }
       double av=totalrev/n;
            System.out.println("Total Vehicles:" +n);
            System.out.println("Total Revenue: $"+ totalrev);
            System.out.println("Average Fee: $" +av);
            System.out.println("Peak Hour Vehicles (>8 hours):"+c);
      
    }
    

}
