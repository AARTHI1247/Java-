import java.util.*;

public class Q3{
    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        String status="";
        double per=0;
        int c=0;
        int lc=0;
        double sum=0;

        scan.nextLine();

        for (int i=0;i<n;i++){

            String name=scan.nextLine();
            int cs=scan.nextInt();
            int ms=scan.nextInt();
            scan.nextLine();

            if(cs>=ms){
                status="Adequate";
            }
            else if(cs<ms && cs>=ms/2){
                status="Low Stock";
                lc++;
            }
            else{
                status="Critical";
                c++;
            }

            if(status.equalsIgnoreCase("Adequate")){
                per=0;
            }
            else if(status.equalsIgnoreCase("Low Stock")){
                per=(ms-cs)+ms/2;
            }
            else{
                per=(ms-cs)+ms*1.5;
            }

            sum=sum+per;

            System.out.println("Product: "+name);
            System.out.println("Current Stock: "+cs);
            System.out.println("Minimum Stock: "+ms);
            System.out.println("Status: "+status);
            System.out.println("Reorder Quantity: "+per);
            System.out.println();
        }

        System.out.println("Total Product: "+n);
        System.out.println("Low Stock Items: "+lc);
        System.out.println("Critical Items: "+c);
        System.out.println("Total Reorder Quantity: "+sum);
    }
}
