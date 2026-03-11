import java.util.*;
public class Q6{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        double bal=scan.nextDouble();
        int n=scan.nextInt();
        double rem=0;
        double sum=0;
        double trem=0;
        int ca=0,cn=0;
        String status="";
        for(int i=0;i<n;i++){
            double tran=scan.nextDouble();
            if(bal<tran){
                status="not Approved";
                cn++;
            }
            else if(bal>tran){
                status="Approved";
                rem=bal-tran;
                ca++;
            }
            sum=sum+tran;
            System.out.println("Transaction 1: $"+tran);
            System.out.println("Status:"+status);
            System.out.println("Remaining Balance:"+rem);
            System.out.println();
        }
        trem=bal-sum;
        System.out.println("Total Transaction 1: "+n);
        System.out.println("Successful Withdrawals: "+ca);
        System.out.println("Failed Withdrawals:"+cn);
        System.out.println("Final Balance:"+trem);
        System.out.println("Total Withdrawn:"+sum);
    }
}
