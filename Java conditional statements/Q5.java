import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double GPA = scan.nextDouble();
        double Income = scan.nextDouble();
        int Score = scan.nextInt();
        scan.nextLine();
        String Type= scan.nextLine();

        System.out.println("GPA:" + GPA);
        System.out.println("Family Income: " + Income);
        System.out.println("Extracurricular Score:" + Score);
        System.out.println("Scholarship Type:" + Type);

        int amt=0;
        String c="";
        if(GPA>=2.5){
            System.out.println("Eligible");
        
        if(Type.equalsIgnoreCase("Merit")){
            if(GPA>=3.8 && Score>=80){
                amt=25000;
                c="Full";
            }
            else if(GPA>=3.5 && Score>=70){
                amt=15000;
                c="Partial ";
            }
            else if(GPA>=3.0 && Score>=60){
                amt=8000;
                c="Minimal ";
            }    
        }
        else if(Type.equalsIgnoreCase("Need-Based")){
            if( Income<=30000 && GPA>=3.5){
                amt=30000;
                c="Full";
            }
            else if(  Income<=50000 && GPA>=3.0){
                amt=18000;
                c="Partial";
            }
            else if(  Income<=70000 && GPA>=2.8){
                amt=10000;
                c="Minimal";
            }  
        }
        else if(Type.equalsIgnoreCase("Sports")){
            if(GPA>=3.0 && Score>=85){
                amt=22000;
                c="Full";
            }
            else if(GPA>=2.8 && Score>=75){
                amt=20000;
                c="Partial";
            }
            else if(GPA>=2.5 && Score>=65){
                amt=12000;
                c="Minimal";
            }  
        }
        System.out.println("Award Amount: $" + amt );
        System.out.println("Award Category:" + c);
    }
        else{
            System.out.println("Not Eligible");
        }
        scan.close();
    }
}
