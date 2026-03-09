import java.util.Scanner;
public class Q7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int Rate= scan.nextInt();
        int Pressure= scan.nextInt();
        double Temperature= scan.nextDouble();
        scan.nextLine();
        String Symptom= scan.nextLine();
        System.out.println("Heart Rate:" + Rate);
        System.out.println("Blood Pressure:" + Pressure);
        System.out.println("Temperature:" + Temperature);
        System.out.println("Symptom:" + Symptom);

        int wait=0;
        String c="";
       if((Rate<50 || Rate>130) || (Pressure>180 || Pressure<90) ||(Temperature >103 || Temperature <96)||(Symptom .equalsIgnoreCase("Life-Threatening"))){
        c="Critical";
       }
       else if(((Rate>50 && Rate<60)||(Rate>110 && Rate<130))||
       ((Pressure>90 && Pressure<100) || (Pressure>160 && Pressure<180))||
       (Temperature<103 && Temperature>101)||
       (Temperature>96 && Temperature<97)||
       (Symptom.equalsIgnoreCase("Severe"))){
                   c="Urgent";
           }
        else if(Symptom.equalsIgnoreCase("Moderate")){
            c="Standard";
        }
        else{
            c="Non-Urgent";
        }
        if(c.equalsIgnoreCase("Critical")){
            wait=0;
        }
        else if(c.equalsIgnoreCase("Urgent")){
            wait=20;
        }
        else if(c.equalsIgnoreCase("Standard")){
            wait=45;
        }
        else if(c.equalsIgnoreCase("Non-Urgent")){
            wait=90;
        }
        String p="";
        if(c.equalsIgnoreCase("Urgent")){
            p="Priority Medical Attention";
        }
        else if(c.equalsIgnoreCase("Non-Urgent")){
            p="Routine Check-up";
        }
        System.out.println("Triage Priority:" + c);
        System.out.println("Estimated Wait Time:" +wait+" minutes");
        System.out.println("Recommended Action: " +p);
        scan.close();
    }
}
