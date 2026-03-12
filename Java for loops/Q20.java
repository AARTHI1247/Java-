import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        double td=0;
        double tw=0;
        double tt=0;
        double tp=0;
        
        for(int i=0;i<n;i++){
            String type=scan.next();
            double amt=scan.nextDouble();
            
            if(type.equalsIgnoreCase("Deposit")){
                td+=amt;
            }
            else if(type.equalsIgnoreCase("Withdrawal")){
                tw+=amt;
            }
            else if(type.equalsIgnoreCase("Transfer")){
                tt+=amt;
            }
            else if(type.equalsIgnoreCase("Payment")){
                tp+=amt;
            }
        }
        
        double net=td-(tw+tt+tp);
        
        if(net>=0){
            System.out.println("Net Balance Change: +"+net);
        }
        else{
            System.out.println("Net Balance Change: "+net);
        }
    }
}
