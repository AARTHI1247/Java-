import java.util.Scanner;
public class Q6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String bookingClass= scan.nextLine();
        int Days= scan.nextInt();
        double Availability= scan.nextDouble();
        scan.nextLine();
        String Type= scan.nextLine();
        System.out.println("Booking Class:" + bookingClass);
        System.out.println("Days Until Departure:" + Days);
        System.out.println("Seat Availability:" + Availability);
        System.out.println("Route Type:" + Type);

        int amt=0;
        double m=0.0;
        String c="";
        if(bookingClass.equalsIgnoreCase("Economy")){
            if(Type.equalsIgnoreCase("Domestic")){
                amt=200;
            }
            else if(Type.equalsIgnoreCase("Int-Short")){
                amt=500;
            }
            else if(Type.equalsIgnoreCase("Int-Long")){
                amt=800;
            }  
        }
        else if(bookingClass.equalsIgnoreCase("Business")){
            if(Type.equalsIgnoreCase("Domestic")){
                amt=600;
            }
            else if(Type.equalsIgnoreCase("Int-Short")){
                amt=1500;
            }
            else if(Type.equalsIgnoreCase("Int-Long")){
                amt=2500;
            }  
        }
        else if(bookingClass.equalsIgnoreCase("First")){
            if(Type.equalsIgnoreCase("Domestic")){
                amt=1000;
            }
            else if(Type.equalsIgnoreCase("Int-Short")){
                amt=3000;
            }
            else if(Type.equalsIgnoreCase("Int-Long")){
                amt=5000;
            }  
        }
        if(Availability<30 && Days<14){
            m=1.8;
            c="High Demand";
        }
        else if(Availability<50 && Days<30){
            m=1.5;
            c="High Demand";
        }
        else if(Availability<60 || (Days>30 && Days<60)){
            m=1.0;
            c="Moderate";
        }
        else if(Availability>=60 && Days>60){
            m=0.8;
            c="Low Demand";
        }
        double fp=m*amt;
        System.out.println("Base Price:$" + amt);
        System.out.println("Demand Multiplier:" +m+"x");
        System.out.println("Final Ticket Price:" +fp);
        System.out.println("Pricing Category:" +c);
        scan.close();
    }
}
