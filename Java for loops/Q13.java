import java.util.*;

public class Q13{
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int ec=0, nec=0;
        String sts="";
        String reason="";

        for(int i=0;i<n;i++){

            String name=scan.next();
            int age=scan.nextInt();
            double weight=scan.nextDouble();
            double haem=scan.nextDouble();

            if(age<18 || age>65){
                sts="Not Eligible";
                reason="Age not between 18 and 65 years";
                nec++;
            }
            else if(weight<50){
                sts="Not Eligible";
                reason="Weight below 50 kg";
                nec++;
            }
            else if(haem<12.5){
                sts="Not Eligible";
                reason="Hemoglobin below 12.5 g/dL";
                nec++;
            }
            else{
                sts="Eligible";
                reason="";
                ec++;
            }

            System.out.println("Donor: " +name);
            System.out.println("Age: " +age +" years");
            System.out.println("Weight: " +weight +" kg");
            System.out.println("Hemoglobin: " +haem +" g/dL");
            System.out.println("Status: " +sts);

            if(sts.equals("Not Eligible")){
                System.out.println("Reason: " +reason);
            }

            System.out.println();
        }

        double er=(ec*100.0)/n;

        System.out.println("Total Donors: " +n);
        System.out.println("Eligible Donors: " +ec);
        System.out.println("Rejected Donors: " +nec);
        System.out.println("Eligibility Rate: " +er +"%");
    }
}
