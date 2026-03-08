import java.util.*;
import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        scan.nextLine();
        String smoke = scan.nextLine();
        String condition = scan.nextLine();
        String tier = scan.nextLine();
        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smoke);
        System.out.println("Pre-existing Conditions: " + condition);
        System.out.println("Coverage Tier: " + tier);
        String group="";
        double base=0;
        if(age>=18 && age<=30){
            group="Young";
        }
        else if(age<=50){
            group="Middle";
        }
        else if(age<=65){
            group="Senior";
        }
        else{
            group="Elderly";
        }
        if(tier.equalsIgnoreCase("Basic")){
            if(group.equals("Young")) base=200;
            else if(group.equals("Middle")) base=250;
            else if(group.equals("Senior")) base=350;
            else base=400;
        }
        else if(tier.equalsIgnoreCase("Standard")){
            if(group.equals("Young")) base=300;
            else if(group.equals("Middle")) base=350;
            else if(group.equals("Senior")) base=450;
            else base=550;
        }
        else if(tier.equalsIgnoreCase("Premium")){
            if(group.equals("Young")) base=500;
            else if(group.equals("Middle")) base=600;
            else if(group.equals("Senior")) base=700;
            else base=800;
        }
        double surcharge=0;
        if(smoke.equalsIgnoreCase("Smoker") && condition.equalsIgnoreCase("Yes")){
            surcharge=base*0.70;
        }
        else if(smoke.equalsIgnoreCase("Smoker")){
            surcharge=base*0.40;
        }
        else if(condition.equalsIgnoreCase("Yes")){
            surcharge=base*0.30;
        }
        double total=base+surcharge;
        System.out.println("Base Premium: $" + base);
        System.out.println("Risk Surcharge: $" + surcharge);
        System.out.println("Total Monthly Premium: $" + total);
    }
}
