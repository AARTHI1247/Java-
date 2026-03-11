import java.util.*;
public class Q5{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String rate="";
        double sum=0;
        double max=0;
        int c=0;
        for (int i=0;i<n;i++){
            int days=scan.nextInt();
            int rooms=scan.nextInt();
            int tr=scan.nextInt();
            double occ=(rooms*100.0)/tr;
            if(occ<=60){
                rate="Low";
            }
            else if(occ>60 && occ<=79){
                rate="Moderate";
            }
            else if(occ>80 && occ<=99){
                rate="High";
            }
            else if(occ==100){
                rate="Full";
                c++;
            }
            sum=sum+occ;
            if(max<occ){
                max=occ;
            }
            
            System.out.println("Rooms Occupied:"+rooms);
            System.out.println("Total Rooms:"+tr);
            System.out.println("Occupancy Rate:"+occ);
            System.out.println("Status:"+rate);
            System.out.println();
        }
        double av=sum/n;
        System.out.println("Total Days Analyzed: "+n);
        System.out.println("Average Occupancy Rate: "+av+"%");
        System.out.println("Peak Occupancy Day: Day "+max);
        System.out.println("Days at Full Capacity: "+c);
    }
}

