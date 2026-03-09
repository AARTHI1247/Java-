import java.util.Scanner;
public class Q8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String Tier= scan.nextLine();
        int Footage= scan.nextInt();
        int Age= scan.nextInt();
        int Score= scan.nextInt();
        System.out.println("Location Tier:" +Tier);
        System.out.println("Square Footage:" + Footage);
        System.out.println("Property Age:" + Age);
        System.out.println("Amenity Score:" + Score);

        int amt=0;
        int per=0;
        int bv=0;
        String c="";
        if(Tier.equalsIgnoreCase("Prime")){
            amt=400;
        }
        else if(Tier.equalsIgnoreCase("Urban")){
            amt=300;
        }
        else if(Tier.equalsIgnoreCase("Suburban")){
            amt=180;
        }
        else if(Tier.equalsIgnoreCase("Rural")){
            amt=100;
        }
        if(Age>0 && Age<=5){
            per=0;
        }
        else if(Age>=6 && Age<=15){
            per=10;
        }
        else if(Age>=16 && Age<=30){
            per=20;
        }
        else if(Age>=31){
            per=35;
        }
        if(Score>80 && Score<=100){
            bv=10;
        }
        else if(Score>=60 && Score<=79){
            bv=5;
        }
        else if(Score>=40 && Score<=59){
            bv=2;
        }
        else if(Score<40){
            bv=0;
        }
        int bs=Footage*amt;
        double av=bs*(1+per/100.0);
        double fv=av+(av*bv/100.0);
        if((Tier.equalsIgnoreCase("Prime")||Tier.equalsIgnoreCase("Urban"))&& Age<15){
            c="hot";
        }
        else if(Tier.equalsIgnoreCase("Suburban")){
            c="Stable";
        }
        else if(Tier.equalsIgnoreCase("Rural") && Age>30){
            c="Slow";
        }
        System.out.println("Base Price Per Sq Ft: $"+ amt);
        System.out.println("Age Adjustment:"+ per+"%");
        System.out.println("Amenity Bonus:$" +bv+"%");
        System.out.println("Estimated Property Value: $"+fv);
        System.out.println("Market Category:" +c);
        scan.close();
    }
}

