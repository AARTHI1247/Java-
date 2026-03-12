import java.util.*;
public class Q11{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        double tic=0;
        int d=0,orgt=0;
        double finalt=0;
        
         String app="";
         for(int i=0;i<n;i++){
            String type=scan.next();
            String cate=scan.next();
            if(type.equalsIgnoreCase("Regular")){
                tic=12;
            }
            else if(type.equalsIgnoreCase("Premium")){
                tic=18;
            }
            else if(type.equalsIgnoreCase("Recliner")){
                tic=25;
            }
            if(cate.equalsIgnoreCase("Adult")){
                d=0;
            }
            else if(cate.equalsIgnoreCase("Child")){
                d=30;
            }
            else if(cate.equalsIgnoreCase("Senior")){
                d=25;
            }
            double indtp=tic*(1-d/100.0);
            orgt=orgt+tic;
            finalt=finalt+indtp;
            double final=tic*(d/100.0);
            System.out.println("Base Price: $" +tic);
            System.out.println("Discount:"+ d);
            System.out.println("Final Price: $" +indtp);
            System.out.println();

        }
        double fd=0;
        if(n>=5){
           fd=finalt*0.90;
             app="yes";
        }
        else{
            app="No";
        }
      double totd=orgt-fianlt;
            System.out.println("total Ticket:" +n);
            System.out.println("Original Total $" +orgt);
            System.out.println("Total Discount: $" +totd);
            System.out.println("Final Total: $" +finalt);
            System.out.println("Group Discount Applied:" +app);
    }
    

}
