import java.util.*;
public class Q7{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double  bill=0;
        String category=""; 
        int sum=0;
        double rev=0;
        for (int i=0;i<n;i++){
            String id=scan.next();
            int units=scan.nextInt();
            if(units<=100){
                bill=units*0.10;
            }
            else  if(units>=101 && units<=200){
                double a=units-100;
                bill=a*0.13+(100*0.10);
            }
            else  if(units>=201 && units<=300){
                double b=units-200;
                bill=b*0.16+(100*0.10)+(100*0.13);
            }
            else  if(units>300){
                double c=units-300;
                bill=c*0.20+(100*0.10)+(100*0.13)+(100*0.16);
            }
            if(units<=200){
                category="Low";
            }
            else if(units>=201 &&units<=300){
                category="Medium";
            }
            else if(units>=300){
                category="High";
            }
            sum=sum+units;
            rev=rev+bill;
            System.out.println("Consumer ID: "+id);
            System.out.println("Units Consumed:"+units);
            System.out.println("Bill Amount:"+bill);
            System.out.println("Category:"+category);
            System.out.println();
        }
        double av=rev/n;
        System.out.println("Total Consumers:"+n);
        System.out.println("Total Units Consumed: "+sum);
        System.out.println("Total Revenue: $"+rev);
        System.out.println("Average Bill: $"+av);
    }
}


